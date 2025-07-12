# Soma de Dois Vetores em Java

Este projeto consiste em um programa Java simples que lê dois vetores (arrays) de números inteiros inseridos pelo usuário e calcula a soma dos elementos correspondentes desses vetores, armazenando o resultado em um terceiro vetor que é então exibido.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, armazenar os vetores e realizar a operação de soma.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite quantos números deseja digitar para cada vetor. Insira o número desejado e pressione Enter.
    * Em seguida, o programa pedirá que você digite os números para o Vetor A, um por vez. Digite cada número e pressione Enter.
    * Depois, o programa pedirá que você digite os números para o Vetor B, também um por vez. Digite cada número e pressione Enter.

5.  **Resultado:** Após inserir todos os números para os dois vetores, o programa exibirá a mensagem "A Soma dos vetores:" seguida por cada elemento do vetor resultante (Vetor C), que representa a soma dos elementos correspondentes do Vetor A e do Vetor B. Cada soma será exibida em uma linha separada.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de números que ele deseja inserir para cada vetor e armazena esse valor na variável inteira `n`.
    3.  Cria três arrays de números inteiros (`int`):
        * `vectA`: Para armazenar os números do primeiro vetor.
        * `vectB`: Para armazenar os números do segundo vetor.
        * `vectC`: Para armazenar a soma dos elementos correspondentes de `vectA` e `vectB`.
        O tamanho de cada array é definido pelo valor de `n`.
    4.  Utiliza um loop `for` para iterar `n` vezes e solicita ao usuário que digite os números para o Vetor A, armazenando cada número na posição correspondente do array `vectA`.
    5.  Utiliza outro loop `for` para iterar `n` vezes e solicita ao usuário que digite os números para o Vetor B, armazenando cada número na posição correspondente do array `vectB`.
    6.  Utiliza um terceiro loop `for` para iterar `n` vezes. Em cada iteração:
        * Calcula a soma do elemento na posição `i` do `vectA` com o elemento na posição `i` do `vectB` e armazena o resultado na posição `i` do `vectC`.
    7.  Finalmente, utiliza um último loop `for` para percorrer o array `vectC` e imprime cada elemento, precedido pela mensagem "A Soma dos vetores:".
    8.  O objeto `Scanner` é fechado ao final do método `main` para liberar os recursos.
