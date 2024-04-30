package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static boolean verificaPositivo(int num) {
        return num >= 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número qualquer (positivo ou negativo): ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            return;
        }
        
        int num = sc.nextInt();
        
        boolean positivo = verificaPositivo(num);
        
        if (positivo) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
        
        sc.close();
    }
}
