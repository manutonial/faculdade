let img1 = document.getElementById('img1')



let p1 = document.getElementById('assunto')
p1.setAttribute('class', 'cor')
p1.style.backgroundColor='black'


let nomes = document.getElementsByTagName('li')
console.log('Numero de documentos li' + nomes.length)

document.write('<table>')
for(let i = 0; i < nomes.length; i++)
     nome[i].innerText = nomes[i].innerText.toUpperCase()
    nomes[i].style.color= 'white'
    nomes[i].backgroundColor= 'red'
    document.write('<tr>')
    document.write('<td>'+ nomes[i].innerText.toUpperCase() +'</td>')
    document.write('</tr>')
document.write('</table>')



let dif = document.getElementsByClassName('dif')
console.log('Numero de elementos da classe dif' + dif.length)

let pdif = document.querySelectorAll('p.dif')
console.log('Numero de elementos p class dif' + pdif.length)