package br.com.dio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AprendendoList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d) + " <<");
        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));
        System.out.println("Exiba todas as notas na ordem que foram irformadas: ");
        //for (Double nota: notas) System.out.println(nota);
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.print("Exiba a somas das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma =0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.print("Exiba a media das notas: " );
        System.out.println(soma / notas.size());
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next <= 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Apague toda a lista: ");
        //notas.clear();
        System.out.println(notas);
        System.out.println("A lista esta vazia ? " + notas.isEmpty());
    }
}
