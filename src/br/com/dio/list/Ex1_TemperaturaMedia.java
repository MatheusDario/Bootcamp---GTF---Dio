package br.com.dio.list;
import java.util.*;
public class Ex1_TemperaturaMedia {
    public static void main(String[] args) {
        //Crie um programa que receba a temperatura dos 6 primeiros meses e armazena-as em uma lista
        //Calcule a media semestral das temperaturas e mostre todas as temperaturas acima desta media
        //E em que mes elas ocorreram
        System.out.println("Digite a temeperatura media dos 6 primeiros meses");
        Scanner sc = new Scanner(System.in);

        List<Integer> temperaturas = new ArrayList<>();
        int mes = 0;
        for(int i=1; i<7; i++) {
            mes = sc.nextInt();
            temperaturas.add(mes);
        }

        Iterator<Integer> iterator = temperaturas.iterator();
        Integer soma = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            soma += next;
        }
        Integer mediaTemperaturas = soma / temperaturas.size();

        System.out.println("A media das temperaturas e: " + mediaTemperaturas);

        Iterator<Integer> iterator1 = temperaturas.iterator();
        int count = 0;
        while (iterator1.hasNext()) {
            Integer temp = iterator1.next();
            if(temp > mediaTemperaturas) {
                switch (count) {
                    case (0):
                        System.out.println("1 - janeiro: " + temp);
                        break;
                    case (1):
                        System.out.println("2 - fevereiro: " + temp);
                        break;
                    case (2):
                        System.out.println("3 - março: " + temp);
                        break;
                    case (3):
                        System.out.println("4 - abril: " + temp);
                        break;
                    case (4):
                        System.out.println("5 - maio: " + temp);
                        break;
                    case (5):
                        System.out.println("6 - junho: " + temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count ++;
        }
        System.out.println(temperaturas);
    }
}
