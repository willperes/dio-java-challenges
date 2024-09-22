package com.willperes.iphone.abstraction;

public interface NavegadorInternet {
    void exibirPagina(String url, int aba);
    void adicionarNovaAba();
    void fecharAba(int aba);
    void atualizarPagina();
}
