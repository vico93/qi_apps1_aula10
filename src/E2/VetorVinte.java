package E2;

import java.util.Scanner;

public class VetorVinte
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        
        // Vetor
        int[] vetor = new int[20];
        
        // Ler valores
        System.out.println("VETOR DE 20 POSIÇÕES!");
        for (int i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite o " + (i+1) + "o. valor: ");
            vetor[i] = stdin.nextInt();
        }
        
        // Verificar pares/ímpares
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] % 2 == 0)
            {
                pares++;
            }
            else
            {
                impares++;
            }
        }
        
        System.out.println("Número de Pares: " + pares
                          + "\nNúmero de Ímpares: " + impares);
    }
}
