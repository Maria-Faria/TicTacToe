# ⚙️ O que esse código faz?
Esse código consiste em um jogo da velha feito em Java, sendo possível que o usuário escolha se deseja jogar contra outra pessoa ou contra o próprio computador.

# 🖥️ Como esse código funciona?

- Primeiramente, o programa cria três objetos, dois do tipo "Pessoa" e um do tipo "Computador"

- Depois o usuário deverá escolher o modo de jogo que deseja, podendo escolher entre "Pessoa x Pessoa" e "Pessoa x Computador"

<img align = "center" src = "https://user-images.githubusercontent.com/114308727/209698290-aa87b964-9ffc-49d0-afd7-c87cbcb570e9.png">

- A variável "op" - do tipo inteiro - irá armazenar a escolha do usuário
  - Caso o usuário selecione "Pessoa x Pessoa, a variável op irá receber 0
  - Caso o usuário escolha "Pessoa x Computador, a variável op irá receber 1
  
- Em seguida, o programa pede para o usuário informar os nomes dos jogadores, que serão armazenados na variável "nome" da classe "Pessoa"

<div style = "display: inline_block">
  <img align = "center" alt = "nome1" src = "https://user-images.githubusercontent.com/114308727/209701720-06f66944-48e5-4c5d-9cb6-3e9cb6808eca.png">
  <img align = "center" alt = "nome2" src = "https://user-images.githubusercontent.com/114308727/209702436-d042afe9-2c48-462c-894d-b520a2173260.png">
</div>

<br>

- Depois cada usuário deverá escolher a linha e a coluna em que deseja jogar, sendo o primeiro jogador representado pelo "X" e o segundo pela "O"

<div style = "display: inline_block">
  <img align = "center" width = "300px" src = "https://user-images.githubusercontent.com/114308727/209706942-605b6f68-2831-4f37-b50e-f8602fe4261c.png">
  <img align = "center" width = "300px" src = "https://user-images.githubusercontent.com/114308727/209707753-89a2253e-f074-4c45-8b31-a812521deec8.png">
</div>

<br>

- O jogo termina quando um dos jogadores consegue completar uma linha, ou uma coluna, ou uma diagonal, ou quando ocorre um empate
<img src = "https://user-images.githubusercontent.com/114308727/209708599-c09fcb37-a281-471a-b980-6c3c45903fd5.png">

