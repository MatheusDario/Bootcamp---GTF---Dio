package br.com.dio.loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0, numero = 0, maior =0, soma = 0, media = 0;

        do {
            System.out.println("Numero: ");
            numero = sc.nextInt();
            soma = soma + numero;
            if(numero > maior) maior = numero;
            count ++;
            media = soma / count;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media);

    }
}
