/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package desafiodois;
import java.util.Scanner;

/**
 *
 * @author Thiag
 */
public class QuestaoDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here




    
        Scanner scan = new Scanner(System.in);

        int[] n = {1, 5, 3, 4, 2};

        System.out.print("Digite o valor de diferença: ");
        int dif = scan.nextInt();

        scan.close();
        System.out.print("A quantidade de pares de inteiros no vetor com uma diferença de " + dif +
                " é igual a: " + contarPares(n, dif));
    }

    public static int contarPares(int[] x, int dif) {
        int result = 0;

        // compara os números entre si
        for (int i = 0; i < x.length; i++) {
            //compara o número do índice i com os próximos
            for (int j = 0; j < x.length; j++) {
                // testa se a diferença entre os números verificados naquele momento do for tem
                // a diferença igual a informada no início e então acumula na variável result
                if (x[i] - x[j] == dif) {
                    result++;
                }
            }
        }
        return result;
    }
}
    
    

