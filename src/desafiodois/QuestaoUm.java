/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiodois;
    import java.util.Arrays;


/**
 *
 * @author Thiag
 */
public class QuestaoUm {


    public static void main(String[] args) {

        int [] listaNumeros = {9,2,1,4,6};
        
        //ordena a lista antes de verificar qual a mediana
        Arrays.sort(listaNumeros);
        
        //verifica o tamanho da lista e faz a media para verificar qual o elemento central
        int result = listaNumeros[listaNumeros.length / 2];

        System.out.println("o número que se encontra na mediana é: " + result);     
    }
}

