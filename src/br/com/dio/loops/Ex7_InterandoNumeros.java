package br.com.dio.loops;
/*
    Mostre os numeros de 3 a 11, sendo que itere de 2 em 2.
    Quando o loop passar pelo 7, este nao deve ser exibido
 */
public class Ex7_InterandoNumeros {
    public static void main(String[] args) {
        System.out.println("Numeros:");
        for(int i=3; i<=11  ;i++ ){
            if(i==7) continue;
            System.out.print(i + " ");
        }
    }
}
