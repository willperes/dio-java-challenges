package com.willperes.iphone.model;

import com.willperes.iphone.abstraction.ReprodutorMusical;
import com.willperes.iphone.exception.NoCurrentSongException;

import java.util.*;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    private Optional<String> musicaAtual = Optional.empty();
    private boolean reproduzindo = false;

    public void tocar() throws NoCurrentSongException {
        if (musicaAtual.isEmpty()) {
            throw new NoCurrentSongException("Nenhuma música selecionada para tocar.");
        }

        if (reproduzindo) {
            System.out.println("A música já está tocando.");
            return;
        }

        System.out.println("Tocando a música:" + musicaAtual.get());
        reproduzindo = true;
    }

    public void pausar() throws NoCurrentSongException {
        if (musicaAtual.isEmpty()) {
            throw new NoCurrentSongException("Nenhuma música selecionada para pausar.");
        }

        if (!reproduzindo) {
            System.out.println("A música já está pausada.");
            return;
        }

        System.out.println("Pausando a música: " + musicaAtual.get());
        reproduzindo = false;
    }

    public void selecionarMusica(String musicaSelecionada) {
        System.out.println("Tocando a música selecionada: " + musicaSelecionada);
        musicaAtual = musicaSelecionada.describeConstable();
        tocar();
    }

    public Optional<String> getMusicaAtual() {
        return musicaAtual;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }
}
