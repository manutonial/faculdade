let cars =  ["Vw", "Ford", "Gm"];

let i = 0;

document.write("<table>");
while (i < cars.length) {
    document.write("<tr>");
    document.write("<td>" + cars[i + 1] + "</td>");
    document.write("<td>" + cars[i] + "</td>");
    document.write("</tr>");
    i++;
}
document.write ("</table>");

/*let i = 0;
do {
    document.write("<h1>" + cars[i] + "</h1>");
    i++;
} while (i < cars.length)
    

let i = 0;
while (i < cars.length) {
    document.write("<h1>" + cars[i] + "</h1>");
    i++;
}
for (let i = 0; i < cars.length; i++) {
    document.write ("<h1>" + cars[i] + "</h1>");
}

// let cars = new Array ("Vw", "Ford", "Gm");

document.write("<p>Segundo elemento do array: " + cars[1] + "</p>");

document.write("<p>Hello world!<p>");
document.write("<p>Segunda linha de codigo em javascript</p>");
document.write("<p>Terceira linha de codigo em javascript</p>");

dia = 26;
hora = 20;

let nome = prompt("Digite seu nome");
let idade = parseInt(prompt("Informe sua idade"));
if (idade >= 18) {
    document.write("<h1>Bem Vindo! " + nome + "</h1>");
} else {
    document.write("<img class= proibido src=img/proibido.avif>");
    document.write("<h2>Desculpe, site apenas para maiores de idade!</h2>")
}

/*
let dia, hora;
dia = 26;
hora = 20;

document.write("<p>Hoje é dia " + dia + " </p>");   
document.write("<p>Hoje é dia " + (dia + 1) + " </p>"); 

if (hora >= 18) {
    document.write("<h1>Boa noite!</h1>");
} else {
    document.write("<h1>Bom dia!</h1>");
}*/
