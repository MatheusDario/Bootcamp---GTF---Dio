package br.com.dio.arrays;
/*
    Um programa que leia 20 numeros inteiros aleatorios entre (0 e 100)
    e armazene em um vetor.
    Ao final mostre os numeros e seus sucessores.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numAleatorios = new int[10];

        for(int i = 0; i < numAleatorios.length; i++) {
            int numero = random.nextInt(10);
            numAleatorios[i] = numero;
        }
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
