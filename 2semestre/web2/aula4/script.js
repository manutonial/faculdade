window.addEventListener('load', registra)

function registra() {
    // let cadastro_clientes = document.getElementById('cadastro_clientes')
    // cadastro_clientes.addEventListener('submit', valida_form)

    document.getElementById('cadastra_clientes').addEventListener('submit', valida_form)
    document.getElementById('nome').addEventListener('input', valida_nome)
    document.getElementById('end').addEventListener('input', valida_endereco)
    document.getElementById('ema').addEventListener('input', valida_email)

}

function valida_form(e) {
    let nome = valida_nome()
    let end = valida_endereco()
    if ((nome == false) || (end == false) || (ema == false)) {
        e.preventDefault()
    }
}

function valida_nome() {
    let nome = document.getElementById('nome')
    let helpnome = document.getElementById('helpnome')
    if (nome.value.length <= 5) {
        helpnome.setAttribute('class', 'form-text text-muted visually-hidden')
        nome.setAttribute('class', 'form-control is-invalid')
        return false
    } else {
        nome.setAttribute('class', 'form-control is-valid')
        helpnome.setAttribute('class', 'form-text text-muted ')
        return true
    }
}

function valida_endereco() {
    let end = document.getElementById('end')
    let helpend = document.getElementById('helpend')
    if (end.value.length <= 5) {
        helpend.setAttribute('class', 'form-text text-muted ')
        end.setAttribute('class', 'form-control is-invalid')
        return false
    } else {
        helpend.setAttribute('class', 'form-text text-muted visually-hidden')
        end.setAttribute('class', 'form-control is-valid')
        return true
    }
}

function valida_email() {
    let email = document.getElementById('ema')
    let helpema = document.getElementById('helpemail')
    if (email.value.includes('@')) {
        helpema.setAttribute('class', 'form-text text-muted visually-hidden')
        email.setAttribute('class', 'form-control is-valid')
        return true
    } else {
        helpema.setAttribute('class', 'form-text text-muted visually-hidden')
        email.setAttribute('class', 'form-control is-invalid')
        return false
    }
}

function valida_data() {
    let dataInput = document.getElementById('data')
    let helpData = document.getElementById('helpdata')

    let hoje = new Date()
    hoje.setHours(0, 0, 0, 0) // Zera a hora para comparar só a data

    let dataInformada = new Date(dataInput.value)
    dataInformada.setHours(0, 0, 0, 0)

    if (dataInformada <= hoje) {
        helpData.setAttribute('class', 'form-text text-muted visually-hidden')
        dataInput.setAttribute('class', 'form-control is-valid')
        return true
    } else {
        helpData.setAttribute('class', 'form-text text-muted')
        dataInput.setAttribute('class', 'form-control is-invalid')
        return false
    }
}