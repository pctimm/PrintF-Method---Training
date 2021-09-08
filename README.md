# O método *printf()*
Esse método do Java pode ser utilizado para formatar Strings e variáveis, ao serem impressos na tela.

*Ao invés do...*

`System.out.println(suaString);`

*... pode-se utilizar o...*

`System.out.printf("%s\n", suaString);` !

Por enquanto, há uma coleção de apenas três classes dentro da pasta \src\ :
* Pontos;
* Abreviação (com til e cê-cedilha);
* e Paragrafo.

## Pontos.java
Com leve inspiração no _"scoreboard"_ do jogo _osu!_ utilizei da [flag] 0 para preencher caracteres, quando se tratam de números inteiros. Para exemplificar, veja
o scoreboard posicionado no canto superior direito [desta imagem.](https://republicadosgeeks.com.br/wp-content/uploads/2021/03/screenshot015.jpg.webp)
> "Pts. 0000021903"

## Abreviação.java
Desenvolvi uma forma de abreviação uma palavra qualquer, gravada em uma String, para três caracteres e um pequeno ponto no final.
Para isso, utilizando o ponto para informar o printf() para fazer um corte na String dada.
> "Oblíquo" -> "Obl."

## Paragrafo.java
Nesta classe tentei trabalhar com a quantidade mínima de caracteres para construir uma "tabulação" dentro do método.
[ O texto é meramente aleatório, é sobre batatas :) ]

# Tutorial/Referências
* https://youtu.be/xk4_1vDrzzo?t=9484 (ponto exato desse vídeo do Youtube em que é explicado o funcionamento do printf().
