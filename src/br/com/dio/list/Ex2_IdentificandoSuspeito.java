package br.com.dio.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex2_IdentificandoSuspeito {
    public static void main(String[] args) {
        //Utilizando listas, um programa que faca 5 perguntas para uma pessoa sobre um crime
        // Se a pessoa responder positivamente a 2 questoes ela deve ser classificada como suspeita
        // Entre 3 e 4 como cumplice as 5 como assassina, caso contrario como inocente

        List<String> listRespostas = new ArrayList<>();
        String resposta;

        Scanner sc = new Scanner(System.in);

            System.out.println("Telefonou para a vitima?");
            resposta = sc.next();
            listRespostas.add(resposta.toLowerCase());
            System.out.println("Esteve no local do crime?");
            resposta = sc.next();
            listRespostas.add(resposta.toLowerCase());
            System.out.println("Mora perto da Vitima?");
            resposta = sc.next();
            listRespostas.add(resposta.toLowerCase());
            System.out.println("Devia para a vitima?");
            resposta = sc.next();
            listRespostas.add(resposta.toLowerCase());
            System.out.println("Ja trabalho com a Vitima?");
            resposta = sc.next();
            listRespostas.add(resposta.toLowerCase());

            System.out.println(listRespostas);

        int count = 0;
        Iterator<String> contador = listRespostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}


