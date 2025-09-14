// ========== QUESTÃO 1 ==========
const URL_BOM_DIA = "https://www.momentodivino.com.br/img/webp/imagens8/que-deus-abencoe-nosso-dia-5054q8LHJXqfDO.webp";
const URL_BOA_TARDE = "https://www.momentodivino.com.br/img/webp/imagens10/linda-e-abencoada-tarde-6425HacKZRcxWu.webp";
const URL_BOA_NOITE = "https://i.pinimg.com/236x/83/10/a0/8310a0268d0fe89ffed24b316d3e3fb0.jpg";

function atualizar_saudacao() {
  const now = new Date();
  const hora = now.getHours();

  const hora_p = document.getElementById("hora");
  const img = document.getElementById("saudacao-img");
  const texto = document.getElementById("saudacao-text");

  hora_p.textContent = `Hora atual: ${hora}h`;

  if (hora >= 6 && hora <= 12) {
    texto.textContent = "Bom dia";
    img.src = URL_BOM_DIA;
  } else if (hora > 12 && hora <= 18) {
    texto.textContent = "Boa tarde";
    img.src = URL_BOA_TARDE;
  } else {
    texto.textContent = "Boa noite";
    img.src = URL_BOA_NOITE;
  }
}
document.addEventListener("DOMContentLoaded", atualizar_saudacao);

// ========== QUESTÃO 2 ==========
function inserir_banco_de_dados() {
  const lista = document.getElementById("lista");
  const novo_item = document.createElement("li");
  novo_item.textContent = "Banco de Dados";
  lista.appendChild(novo_item);
}

// ========== QUESTÃO 3 ==========
function mostrar_primeiro_ultimo() {
  const lista = document.getElementById("lista").getElementsByTagName("li");
  if (lista.length > 0) {
    document.getElementById("primeiro").value = lista[0].textContent;
    document.getElementById("ultimo").value = lista[lista.length - 1].textContent;
  }
}

// ========== QUESTÃO 4 ==========
function inserir_disciplina_prompt() {
  const disciplina = prompt("Digite o nome da disciplina:");
  if (disciplina) {
    const lista = document.getElementById("lista");
    const novo_item = document.createElement("li");
    novo_item.textContent = disciplina;
    lista.appendChild(novo_item);
  }
}

