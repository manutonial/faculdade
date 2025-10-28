document.addEventListener('DOMContentLoaded', () => {
    const PRECO_FIXO = 1109
    const IMAGENS_CELULAR = {
        preto: 'img/preto.webp',
        azul: 'img/azul_escuro.webp'
    }

    const elements = {
        imagem: document.getElementById('imagem-input'),
        input_preto: document.getElementById('botao-preto'),
        input_azul: document.getElementById('botao-azul'),
        input_quantidade: document.getElementById('input-quantidade'),
        valor_total: document.getElementById('input-valor-total'),
        previsao: document.getElementById('previsao-entrega'),
        botao_comprar: document.getElementById('botao-comprar'),
        mensagem: document.getElementById('valida-quantidade')
    }

    const escolher_cor = () => {    
        elements.imagem.src = elements.input_preto.checked ? IMAGENS_CELULAR.preto : IMAGENS_CELULAR.azul
    }

    const atualizar_valor_total = () => {
        const quantidade = Number(elements.input_quantidade.value) || 0
        const total = quantidade * PRECO_FIXO
        elements.valor_total.value = total > 0 ? total.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' }) : ''
    }

    const calcular_previsao_entrega = () => {
        const data = new Date()
        data.setDate(data.getDate() + 10)
        elements.previsao.textContent = 'Previsão de entrega: ' + data.toLocaleDateString('pt-BR')
    }

    const validar_compra = () => {
        const quantidade = Number(elements.input_quantidade.value)
        if (quantidade > 0) {
            elements.mensagem.textContent = 'Compra efetuada com sucesso!'
            elements.mensagem.style.color = 'green'
        } else {
            elements.mensagem.textContent = 'Informe a quantidade!'
            elements.mensagem.style.color = 'red'
        }
    }

    const init_event_listeners = () => {
        elements.input_preto.addEventListener('change', escolher_cor)
        elements.input_azul.addEventListener('change', escolher_cor)
        elements.input_quantidade.addEventListener('input', atualizar_valor_total)
        elements.botao_comprar.addEventListener('click', validar_compra)
    }

    const main = () => {
        escolher_cor()
        atualizar_valor_total()
        calcular_previsao_entrega()
        init_event_listeners()
    }

    main()
})
