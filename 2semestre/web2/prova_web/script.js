const preco_fixo = 1.109
const data_atual = Date()
const imagem_celular = ["img/azul_escuro.webp", "img/preto.webp"]


let valor_total = document.getElementById('input-valor-total')
let botao_comprar = document.getElementById('botao-comprar')
let input_preto = document.getElementById('botao-preto')
let input_azul = document.getElementById('botao-azul')

function escolhe_cor(imagem_celular) {
    if (input_preto.checked) {
        return imagem_celular[0]
    }
    if (input_azul.checked) {
        return imagem_celular[1]
    }
}

function quantidade_valor() {
    let quantidade = document.getElementById('input-quantidade').value
    return quantidade * preco_fixo
}

function valida_botao_comprar() {
    let quantidade = document.getElementById('input-quantidade').value
    if (quantidade > 0) {
        return alert("Compra efetuada com sucesso")
    } else {
        return alert("Informe a quantidade")
    }
}
$(document).ready(escolhe_cor)
$(valor_total).append(quantidade_valor)
$(botao_comprar).click(valida_botao_comprar)




    