<!doctype html>
<html lang="pt-br">
    <head>
        <title>Aula 1 PHP</title>
        <!-- Required meta tags -->
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
        />

        <!-- Bootstrap CSS v5.2.1 -->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous"
        />
    </head>
    <body>  
        <h1> Introdução ao PHP </h1>
        <?php 
        $nome = 'Ernani';
        $email = 'ernanigottardo@gmail.com';
        $pos = strpos($email, '@');

        if($pos === false)
        {
            echo "<p> Email invalido <p>";
        } 
        else
        {
            echo "<p> Posição do @:" .$pos."</p>";
            $user = substr($email, 0, $pos);
            $server = substr($email, ($pos + 1));
            echo "<p> Usuário = " .$user."</p>";
            echo "<p> Servidor = " .$server."</p>";
        }

        echo "<p> Data de hoje:" .date("d/m/y H:i:s")."</p>";
        echo "<p> Dia da semana: " .date("w"). "</p>";
        
        $hj = date_create();
        echo "<p> Data formatada: " .date_format($hj, "d/m")."</p>";

        $valor = 10.50;
        $cars = ['Monza'];
        $cars[1] = 'Fusca';
        $cars[2] = 'Gol';
        $cars[3] = 'Uno';

        echo "<table class ='table'";
        foreach($cars as $car)
        {
            echo "<tr>";
            echo "<td>" .$car. "</td>";
            echo "</tr>";
        }
        echo "</table>";

        echo sprintf("Length do array: %d", count($cars));

        echo "<h2>Hello World PHP!!</h2>";
        ?>

        <script> 
            document.write('<h2>Hello World JS!!</h2');
        </script>


        <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
            integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
            crossorigin="anonymous"
        ></script>

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
            integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
            crossorigin="anonymous"
        ></script>
    </body>
</html>
