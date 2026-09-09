/*
EXERCICIO: fazer o useState ser global e passar por parametro para os botoes
*/

import { useState } from "react"

import "./styles.css";

import Botao from "./Botao"

export default function App() {
  const [num, setNum] = useState(0); // aq

  return (
    <div className="App">
      <h1>Aula 6</h1>

      <Botao type="primary" size="large" text="Botao " shadow='on' numero={num} funcao={setNum}/>
      <Botao type="success" size="medium" text="Outro botao" shadow='off' numero={num} funcao={setNum}/>
    </div>
  );
}