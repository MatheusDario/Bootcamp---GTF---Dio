package br.com.dio.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Digite sua nota: ");
        nota = sc.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Digite uma nota de 0 a 10");
            nota = sc.nextInt();
        }

        System.out.println("Obrigado por sua avialiacao");
    }
}
