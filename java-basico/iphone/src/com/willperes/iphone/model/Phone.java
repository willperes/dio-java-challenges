package com.willperes.iphone.model;

import com.willperes.iphone.abstraction.AparelhoTelefonico;
import com.willperes.iphone.abstraction.NavegadorInternet;
import com.willperes.iphone.abstraction.ReprodutorMusical;

public class Phone {
    public final AparelhoTelefonico aparelhoTelefonico;
    public final NavegadorInternet navegadorInternet;
    public final ReprodutorMusical reprodutorMusical;

    public Phone(AparelhoTelefonico aparelhoTelefonico, NavegadorInternet navegadorInternet, ReprodutorMusical reprodutorMusical) {
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
        this.reprodutorMusical = reprodutorMusical;
    }
}
