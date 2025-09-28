function adicionarProduto() {
    const nomeProduto = $('#produto-input').val().trim();

    if (nomeProduto) {
        $('#lista-produtos').append(
            `<li class="list-group-item produto">${nomeProduto}</li>`
        );
        limparInput();
        mostrarCaracteres(); 
    }
}

function riscarProduto() {
    // delegação de evento para pegar inclusive os itens adicionados dinamicamente
    $('#lista-produtos').on('click', '.produto', function () {
        $(this).toggleClass('riscado');
    });
}


function mostrarCaracteres() {
    const valor = $('#produto-input').val();
    $('#helpId').text(valor.length);

    if (valor.length == 0) {
        $('#botao-confirmar').prop('disabled', true);
        $('#produto-input').addClass('is-invalid')
    } else {
        $('#botao-confirmar').prop('disabled', false);
        $('#produto-input').addClass('is-valid')
    }
}

function limparInput() {
    $('#produto-input').val('');
}

// chamando eventos jquery
$(document).ready(function () {
    $('#botao-confirmar').on('click', function (e) {
        e.preventDefault();
        adicionarProduto();
    });

    $('#produto-input').on('input', function () {
        mostrarCaracteres();
    });

    // inicia botão desabilitado
    $('#botao-confirmar').prop('disabled', true);

    // exemplo: deixa o segundo item vermelho
    $('.produto').eq(1).css('color', 'red');

    $('#produto').each(function(i, val){
        console.log(i + '-' + $(this).text())
    })
    // ativa riscar produtos
    riscarProduto();

    // mask te obriga a esscrever em determinado padrão
    $('.cpf').mask('000.000.000-00', {clearIfNotMatch:true})

    $('.placa').mask('SSS-0A00', {clearIfNotMatch:true})
})