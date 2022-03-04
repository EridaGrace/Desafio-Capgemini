/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiodois;

/**
 *
 * @author Thiag
 */
public class QuestaoTres {


    public static void main(String[] args) {

        String text = "ola mundo";
        encript(text);
    }

    public static void encript(String frase) {

        int auxiliar = 0;
        // replaceAll é usado para desconsiderar os espaços em branco
        // regex -> \\s+ corresponde a vários espaços em branco
        String fraseA = frase.replaceAll("\\s+", "");

        //sqtr calcula a raiz do tamanho da frase
        Double raiz = Math.sqrt(fraseA.length());

        //ceil arredonda para cima
        int raizArreCima = (int) Math.ceil(raiz);
        //ceil arredonda para cima
        int raizArreBaixo = (int) Math.floor(raiz);

        int lenght = 0;

        if (raizArreCima == raizArreBaixo) {
            lenght = raizArreCima;
        } else if (Math.pow(raizArreBaixo, 2) >= fraseA.length()) {
            lenght = raizArreBaixo;
        } else {
            lenght = raizArreCima;
        }

        //cria uma matriz bidimensional
        char[][] grid = new char[lenght][lenght];

        //movimenta os elementos da frase colocando nas suas posições
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                if (auxiliar <= fraseA.length() - 1) {
                    grid[i][j] = fraseA.charAt(auxiliar);
                    auxiliar++;
                } else {
                    grid[i][j] = ' ';
                }
            }
        }

        // printa a matriz com colunas e linhas mostrando a frase criptografada
        for (int i = 0; i < grid.length; i++) {
               for (char[] chars : grid) {
                System.out.print(chars[i]);
            }
            System.out.print(" ");
        }
    }
}
    

