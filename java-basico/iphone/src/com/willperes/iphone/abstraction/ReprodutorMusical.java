package com.willperes.iphone.abstraction;

import com.willperes.iphone.exception.NoCurrentSongException;

public interface ReprodutorMusical {
    void tocar() throws NoCurrentSongException;
    void pausar() throws NoCurrentSongException;
    void selecionarMusica(String musica);
}
