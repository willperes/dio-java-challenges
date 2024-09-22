package com.willperes.iphone;

import com.willperes.iphone.factory.PhoneFactory;
import com.willperes.iphone.model.Phone;

public class Main {
    public static void main(String[] args) {
        final Phone phone = PhoneFactory.create();

        phone.aparelhoTelefonico.ligar("11912345678");
        phone.aparelhoTelefonico.desligar();

        phone.reprodutorMusical.selecionarMusica("Haddaway - Life");
        phone.reprodutorMusical.tocar();
        phone.reprodutorMusical.pausar();

        phone.aparelhoTelefonico.atender("11912345678");
        phone.aparelhoTelefonico.desligar();

        phone.navegadorInternet.adicionarNovaAba();
        phone.navegadorInternet.exibirPagina("https://google.com", 1);
    }
}
