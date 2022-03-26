package br.com.dio.loops;
import java.util.Scanner;
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntNumeros, numeros;
        int qntPares = 0, qntImpares = 0;

        System.out.println("Quantas entradas: ");
        qntNumeros = sc.nextInt();

        for(int i=0; i<qntNumeros; i++) {
            System.out.println("Insira os Numeros: ");
            numeros = sc.nextInt();

            if(numeros % 2 == 0) qntPares++;
            else qntImpares++;
        }

        System.out.println("Tem " + qntPares + " numeros pares");
        System.out.println("Tem " + qntImpares + " numeros Impares");
    }
}
