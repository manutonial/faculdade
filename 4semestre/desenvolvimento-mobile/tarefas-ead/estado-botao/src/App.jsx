import { useState } from "react";

import "./styles.css";

import Botao from "./components/botao";

export default function App() {
  const [num, setNum] = useState(0);

  return (
    <div className="App">
      <h1>Aula 6 - Botoes</h1>

      <h2>{num}</h2>

      <Botao type="success" text="Incrementar" shadow="on" funcao={() => setNum(num + 1)} />
      <Botao type="error" text="Decrementar" funcao={() => setNum(num - 1)} />
      <Botao type="secondary"  text="Resetar" funcao={() => setNum(0)} />
      <Botao type="primary" text="Aleatorio" shadow="on" funcao={() => setNum(Math.floor(Math.random() * 100))} />
      <Botao type="success"  text="+100" funcao={() => setNum(num + 100)} />
      <Botao type="error" text="-50" funcao={() => setNum(num - 50)} />
      <Botao type="primary" text="Dobrar" shadow="on" funcao={() => setNum(num * 2)} />
    </div>
  );
}
