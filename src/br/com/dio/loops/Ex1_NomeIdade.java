package br.com.dio.loops;

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Digite seu nome: ");
            nome = sc.next();
            if(nome.equals("0")) break;
            System.out.println("Digite a sua idade: ");
            idade = sc.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
