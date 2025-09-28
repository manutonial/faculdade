# AULA 14

## Media Queries CSS

> Usadas para criar estilos diferentes para certos tamanhos de tela 

```css
@media screen and (min-width: 400px) 
{
    body {
        background-color: lightgreen;
    }
}

@media screen and (min-width: 600px) 
{
    body {
        background-color: lightpink;
    }
}
```

- No caso acima, quando a largura da tela estiver entre 400 e 600px, a cor do fundo sera `lightgreen`. 
- Se a largura for de 600 ou mais, sera `lightpink`

```css
@media print 
{
    body {
        background-color: gray;
    }

    .nprint {
        display: none;
    }
}
```

> `@media print` pode ser usado para alterar como os elementos da pagina se comportam na impressao (Ctrl + P)

- No exemplo acima, na impressao o background da pagina sera cinza e todos os elementos na classe nprint nao serao impressos.

## Bootstrap

É essencialmente uma biblioteca de componentes HTML, CSS e JavaScript que fornece uma base para criar elementos de interface de usuário, como botões, formulários, barras de navegação, grids e mais, de forma consistente e adaptada a diferentes dispositivos. 

### Demo:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
    
    <h1>Hello, world!</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    
</body>
</html>
```





