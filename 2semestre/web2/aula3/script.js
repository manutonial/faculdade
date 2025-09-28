// Evento principal ao carregar a página
window.addEventListener('load', inicializarEventos);

// Estado global
let contadorCliques = 0;

// Função principal de inicialização
function inicializarEventos() {
  configurarBotaoTrocaCor();
  configurarCampoNome();
  atualizarContadorCaracteres();
}

// Configura o botão de troca de cor
function configurarBotaoTrocaCor() {
  const botaoTrocaCor = document.getElementById('botao_troca_cor');
  botaoTrocaCor.addEventListener('click', trocarCorDeFundo);
}

// Configura os eventos do campo de nome
function configurarCampoNome() {
  const campoNome = document.getElementById('nome');
  campoNome.addEventListener('focus', exibirLogFoco);
  campoNome.addEventListener('blur', exibirLogBlur);
  campoNome.addEventListener('keyup', atualizarContadorCaracteres);
}

// Atualiza o contador de caracteres do campo nome
function atualizarContadorCaracteres() {
  const campoNome = document.getElementById('nome');
  const contador = document.getElementById('carac');
  contador.innerText = campoNome.value.length;
}

// Troca a cor de fundo da página
function trocarCorDeFundo() {
  if (contadorCliques >= 10) return;

  contadorCliques++;
  const corAleatoria = gerarCorAleatoria();
  document.body.style.backgroundColor = corAleatoria;

  alert(`Clique número: ${contadorCliques}`);

  if (contadorCliques === 10) {
    alert('Limite de 10 cliques atingido!');
    document.getElementById('botao_troca_cor').disabled = true;
  }
}

// Gera uma cor RGB aleatória
function gerarCorAleatoria() {
  const r = Math.floor(Math.random() * 255);
  const g = Math.floor(Math.random() * 255);
  const b = Math.floor(Math.random() * 255);
  return `rgb(${r}, ${g}, ${b})`;
}

// Logs de eventos
function exibirLogFoco() {
  console.log('Campo nome recebeu foco');
}

function exibirLogBlur() {
  console.log('Campo nome perdeu foco');
}
