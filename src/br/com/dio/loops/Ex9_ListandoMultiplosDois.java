package br.com.dio.loops;
/*
    Liste de 1 a 14 sendo que somente multiplos de 2 sejam listados.
    Entretanto quando passar pelo 12, o mesmo deve ser abortado
 */
public class Ex9_ListandoMultiplosDois {
    public static void main(String[] args) {
        System.out.println("Multiplos de 2 com FOR: ");
        for(int i=1; i<=14; i++) {
            if(i == 12) continue;
            if(i %2 == 0) System.out.print(i + " ");
        }

        System.out.println("\nMultiplos de 2 com WHILE: ");
        int count = 1, numeros = 14;
        while (count <= numeros){
            if(count == 12) continue;
            if(count %2 == 0) System.out.print(count + " ");
            count++;
        }
    }
}
