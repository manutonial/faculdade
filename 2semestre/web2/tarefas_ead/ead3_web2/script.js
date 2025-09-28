const imagens = [
    "img/bangkok.jpg",
    "img/bangkok2.jpg",
    "img/beaches.jpg",
    "img/thailand.jpg",
    "img/visit.jpg"
];

let indice = 0;

function atualiza_slide() {
    document.getElementById("slide").src = imagens[indice];
}

function proxima_imagem() {
    indice = (indice + 1) % imagens.length;
    atualiza_slide();
}

function anterior_imagem() {
    indice = (indice - 1 + imagens.length) % imagens.length;
    atualiza_slide();
}

function inserir_lista() {
    const input_disciplina = document.getElementById("input_disciplina");
    const erro_lista = document.getElementById("erro_lista");
    const texto = input_disciplina.value.trim();

    if (texto === "") {
        erro_lista.textContent = "Por favor, digite o nome da disciplina.";
        return;
    }

    const lista_disciplinas = document.getElementById("lista_disciplinas");
    const novo_item = document.createElement("li");
    novo_item.className = "list-group-item";
    novo_item.textContent = texto;
    lista_disciplinas.appendChild(novo_item);

    erro_lista.textContent = "";
    input_disciplina.value = "";
}

document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("btn_inserir_lista").addEventListener("click", inserir_lista);
});