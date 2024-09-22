package com.willperes.iphone.model;

import com.willperes.iphone.abstraction.AparelhoTelefonico;

import java.util.*;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    private Optional<String> ligacaoAtual = Optional.empty();

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        ligacaoAtual = numero.describeConstable();
    }

    public void atender(String numero) {
        System.out.println("Atendendo a ligação de: " + numero);
        ligacaoAtual = numero.describeConstable();
    }

    public void desligar() {
        System.out.println("Desligando a ligação atual");
        ligacaoAtual = Optional.empty();
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
