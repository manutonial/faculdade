let imagens_femininas = ["img/f_normal.png", "img/f_over.png", "img/f_obese.png"]
let imagens_masculinas = ["img/m_normal.png", "img/m_over.png", "img/m_obese.png"]

function calcula_imc(peso, altura) {
    return peso / (altura * altura)
}

function classifica_imc(imc) {
    if (imc < 18) return "Peso normal"
    else if (imc > 18 && imc < 28) return "Sobrepeso"
    else return "Obesidade"
}

function retorna_imagem(classificacao_imagem) {
    switch (classificacao_imagem) {
        case "Peso normal" : return 0
        case "Sobrepeso": return 1
        case "Obesidade": return 2
    }
}

function valida_botao() {
    let botao_validar = document.getElementById('botao-imc')
    let checkbox_validar = document.getElementById('concordo-termos')

    if(checkbox_validar.checked) {
        botao_validar.disabled = false
    } else {
        botao_validar.disabled = true
    }
}   

function verifica_sexo() {
    let feminino = document.getElementById('feminino-form').checked
    let masculino = document.getElementById('masculino-form').checked

    if (feminino === true) return "feminino"
    if (masculino === true) return "masculino"
}

function valida_campo_input(input) {
    const valor = parseFloat(input.value);
    if (!isNaN(valor) && valor > 0) {
        input.setAttribute("class", "form-control is-valid");
    } else {
        input.setAttribute("class", "form-control is-invalid");
    }
}

function main () {
    let checkbox_validar = document.getElementById('concordo-termos')
    let botao_validar = document.getElementById('botao-imc')
    let peso_input = document.getElementById('peso-input')
    let altura_input = document.getElementById('altura-input')

    checkbox_validar.addEventListener('change', valida_botao)
    

        // Validação em tempo real
    peso_input.addEventListener('input', function() {
        valida_campo_input(peso_input);
    });

    altura_input.addEventListener('input', function() {
        valida_campo_input(altura_input);
    })
   
    botao_validar.addEventListener('click', function() {
        
        valida_campo_input(peso_input)
        valida_campo_input(altura_input)

        let peso = parseFloat(document.getElementById('peso-input').value)
        let altura = parseFloat(document.getElementById('altura-input').value)
        let sexo = verifica_sexo()

        if (sexo == null) {
            alert("Selecione o sexo")
            return
        }

        if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
            alert("Preencha os dados corretamente")
            return
        }
        
        let imc =  calcula_imc(peso, altura)
        let classificacao = classifica_imc(imc)
        let indice_imagem = retorna_imagem(classificacao)

        let imagem_src = ""
        if (sexo === "feminino") {
            imagem_src = imagens_femininas[indice_imagem]
        } else if (sexo === "masculino") {
            imagem_src = imagens_masculinas[indice_imagem]
        }
        
        let resultado = document.getElementById('resultado-imc');
        resultado.innerHTML = ""; // limpa antes
        resultado.insertAdjacentHTML("beforeend",
            "<h4>IMC = " + imc.toFixed(2) + " - " + classificacao + "</h4>" +
            "<img src='" + imagem_src + "' alt='" + classificacao + "' class='img-fluid mt-2' style='max-width: 200px;'>"
        )
    })
}

main()