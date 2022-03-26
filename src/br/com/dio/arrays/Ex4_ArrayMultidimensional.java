package br.com.dio.arrays;

import java.util.Random;

/*
    Gere e imprima uma matriz M 3x3 com valores aleatorios entre 0 e 9.
 */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[3][3];

        for(int i=0; i < M.length; i++) {
            for(int j=0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int elemento: linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
