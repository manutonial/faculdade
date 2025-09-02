// Questão 1 - Função normal
function converterTemperatura() {
  const f = parseFloat(document.getElementById("fahrenheit").value);
  const c = (f - 32) * 2;
  let mensagem = "";
  let classe = "";

  if (c <= 12) {
    mensagem = "Frio";
    classe = "frio";
  } else if (c <= 24) {
    mensagem = "Agradável";
    classe = "agradavel";
  } else {
    mensagem = "Quente";
    classe = "quente";
  }

  document.getElementById("resultadoTemperatura").innerHTML =
    `<div class="${classe}">Temperatura: ${c.toFixed(1)}°C - ${mensagem}</div>`;
}

// Questão 2 - Função anônima
const inserirNotas = function () {
  let notas = [];
  for (let i = 0; i < 4; i++) {
    let nota = parseFloat(prompt(`Informe a nota ${i + 1}:`));
    notas.push(nota);
  }
  calcularMedia(notas);
};

// Questão 3 - Arrow function
const calcularMedia = (notas) => {
  let soma = 0;
  notas.forEach(n => soma += n);
  const media = soma / notas.length;

  let resultado = "";
  let imagem = "";

  if (media < 1.8) {
    resultado = "Reprovado";
    imagem = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFcgQrsfeYiodqNrrLGtTpaVEkNnfswjh1oQ&s";
  } else if (media < 7) {
    resultado = "Em Exame";
    imagem = "https://cdn-icons-png.flaticon.com/512/2299/2299283.png";
  } else {
    resultado = "Aprovado";
    imagem = "https://cdn-icons-png.flaticon.com/512/4157/4157080.png";
  }

  let html = `<table><tr>`;
  notas.forEach((n, i) => html += `<th>Nota ${i + 1}</th>`);
  html += `<th>Média</th><th>Resultado</th><th>Imagem</th></tr><tr>`;
  notas.forEach(n => html += `<td>${n}</td>`);
  html += `<td>${media.toFixed(1)}</td><td>${resultado}</td><td><img src="${imagem}"></td></tr></table>`;

  document.getElementById("tabelaNotas").innerHTML = html;
};