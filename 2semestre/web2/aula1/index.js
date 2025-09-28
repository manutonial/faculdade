let nome = prompt('Digite seu nome')
let idade = prompt('Digite sua idade')

document.write('<h1> Nome' + nome + '</h1>')
document.write('<p class == idade>Idade ' + idade + ' Anos </p>')

let alunos = ['Paula', 'Maria', 'Júlia']
let alunos2 = new Array ('Paula', 'Maria', 'Anderson')
let notas = ['6.5', '7.2', '9.2']

/*document.write('<ul>')
for(let i = 0; i < alunos.length; i++) 
{
    document.write('<li>' + alunos[i] + '</li>')
}
document.write('</ul>')*/

document.write('<table>')

document.write('<tr>')
document.write('<th> Alunos </th>')
document.write('<th> Notas </th>')
document.write('</tr>')
for (let i = 0; i < alunos.length; i++) 
{
    document.write('<tr>')
    document.write('<td>' + alunos[i] + '</td>')
    document.write('<td>' + notas[i] + '</td>')
    document.write('</tr>')

}
document.write('</table>')



