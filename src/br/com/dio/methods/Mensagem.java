package br.com.dio.methods;

public class Mensagem {

    public static void obeterMesangem(int hora) {
        if(hora >= 18 && hora <= 23) {
            mensagemBoaNoite();
        } else if (hora >=13 && hora <= 17) {
            mensagemBoaTarde();
        } else {
            mensagemBomDia();
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }
    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }
    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite");
    }
}
