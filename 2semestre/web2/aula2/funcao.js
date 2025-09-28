function soma(x,y)
{
    let s = x + y
    console.log("Soma" + s)
    return s
}

let raiz = function(b)
{
    return Math.sqrt(b)
}

let aleatorio = ()=> Math.random()
let aleatorioM = () => 
    {
        let nr = Math.ceil(Math.random() * 60)
        return nr
    }

let aleatorioNr = (limite) =>
{
    let nrlimite = Math.ceil(Math.random() * limite)
    return nrlimite
}

function teste()
{
    // inicializada com var é de escopo global
    //var nome = 'Ernani'

    let nome='Ernani'
    if(nome.length == 6)
    {
        document.write('<h1> Nome' + nome + '</h1>')
        let idade = 47;
    }
}
teste()
document.write(nome)

document.write('<h1> Soma' + soma(8,9) + '</h1>')
document.write('<h1> A raiz quadrada de 9' + raiz(9) + '</h1>')
document.write('<h1> Aleatorio Mega ' + aleatorio() + '</h1>')
document.write('<h1> Aleatorio Mega ' + aleatorioM() + '</h1>')
document.write(aleatorioNr())