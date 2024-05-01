package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Este programa atribui valores inteiros a um vetor com 8 elementos e os ordena em ordem crescente.");
        
        Scanner sc = new Scanner(System.in);
        
        int vet[] = new int[8];
        int i, j, aux;
        
        for (i = 0; i < 8; i++) {
            System.out.println("Digite um valor para o índice " + i + ":");
            vet[i] = sc.nextInt();
        }
        
        for (i = 1; i < 8; i++) {
            aux = vet[i];
            j = i - 1;
            
            while (j >= 0 && vet[j] > aux) {
                vet[j + 1] = vet[j];
                j--;
            }
            
            vet[j + 1] = aux;
        }
        
        System.out.print("Vetor ordenado: |");
        for (i = 0; i < 8; i++) {
            System.out.print(vet[i] + "|");
        }
    }
}
