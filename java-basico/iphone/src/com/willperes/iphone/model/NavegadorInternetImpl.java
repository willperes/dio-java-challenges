package com.willperes.iphone.model;

import com.willperes.iphone.abstraction.NavegadorInternet;
import com.willperes.iphone.exception.NavigatorTabNotFoundException;

import java.util.*;

public class NavegadorInternetImpl implements NavegadorInternet {
    private final List<String> abas = new ArrayList<>();

    public void exibirPagina(String url, int aba) throws NavigatorTabNotFoundException {
        if (aba < 1) {
            throw new IllegalArgumentException("Número da aba não pode ser menor que 1");
        }

        System.out.println("Validando se a aba informada existe.");
        validarSeAbaExiste(aba);

        System.out.println("Exibindo na aba " + aba + " a URL: " + url);
        final int abaIndex = aba - 1;
        abas.set(abaIndex, url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
        abas.add("");
    }

    public void fecharAba(int aba) throws NavigatorTabNotFoundException {
        validarSeAbaExiste(aba);

        System.out.println("Fechando a aba: " + aba);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public List<String> getAbas() {
        return abas;
    }

    private void validarSeAbaExiste(int aba) throws NavigatorTabNotFoundException {
        if (aba > abas.size()) {
            throw new NavigatorTabNotFoundException("Aba informada não existe");
        }
    }
}
