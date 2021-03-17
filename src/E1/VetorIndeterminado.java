package E1;

import java.util.ArrayList;
import java.util.Scanner;

public class VetorIndeterminado
{
    public static void main(String[] args)
    {
        // Entrada
        Scanner stdin = new Scanner(System.in);
        
        // Lista
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        // Ler Valores
        int opcao;

        System.out.println("VETOR DINÂMICO!");
        do
        {
            System.out.print("Digite um valor, 0 para encerrar a lista: ");
            opcao = stdin.nextInt();
            
            if (opcao != 0)
            {
                lista.add(opcao);
                System.out.println("Lista atualizada, lista atual: \n" + lista);
            }          
            
        }
        while (opcao != 0);
        
        System.out.print("Digite um valor para procurar na lista: ");
        opcao = stdin.nextInt();
        
        int cont = 0;        
        for (int i : lista)
        {
            if (i == opcao)
            {
                cont++;
            }
        }
        
        System.out.println(opcao + " apareceu na lista " + cont + " vezes!");
        
    }
}
