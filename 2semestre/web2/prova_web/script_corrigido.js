const preco_fixo = 1109;
const imagem_celular = ["img/preto.webp", "img/azul_escuro.webp"];

// Referências aos elementos
let valor_total = document.getElementById('input-valor-total');
let botao_comprar = document.getElementById('botao-comprar');
let input_preto = document.getElementById('botao-preto');
let input_azul = document.getElementById('botao-azul');
let previsao = document.getElementById('previsao-entrega');
let mensagem = document.getElementById('mensagem');

// Trocar imagem conforme cor selecionada
function escolhe_cor() {
    let imagem = document.getElementById('imagem-input');
    if (input_preto.checked) {
        imagem.src = imagem_celular[0];
    } else if (input_azul.checked) {
        imagem.src = imagem_celular[1];
    }
}

// Atualizar valor total
function quantidade_valor() {
    let quantidade = Number(document.getElementById('input-quantidade').value);
    valor_total.value = (quantidade * preco_fixo).toFixed(2);
}

// Calcular previsão de entrega (+10 dias)
function calcular_previsao() {
    let data = new Date();
    data.setDate(data.getDate() + 10);
    previsao.textContent = data.toLocaleDateString('pt-BR');
}

// Validar compra
function valida_botao_comprar() {
    let quantidade = Number(document.getElementById('input-quantidade').value);
    if (quantidade > 0) {
        mensagem.textContent = "Compra efetuada com sucesso!";
        mensagem.style.color = "green";
    } else {
        mensagem.textContent = "Informe a quantidade!";
        mensagem.style.color = "red";
    }
}

// Eventos
input_preto.addEventListener("change", escolhe_cor);
input_azul.addEventListener("change", escolhe_cor);
document.getElementById('input-quantidade').addEventListener("input", quantidade_valor);
botao_comprar.addEventListener("click", valida_botao_comprar);

// Inicia com cor preta e data atualizada
window.onload = function() {
    escolhe_cor();
    calcular_previsao();
}
