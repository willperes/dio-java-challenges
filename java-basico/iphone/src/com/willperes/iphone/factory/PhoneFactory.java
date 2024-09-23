package com.willperes.iphone.factory;

import com.willperes.iphone.abstraction.*;
import com.willperes.iphone.model.*;

public class PhoneFactory {
    public static Phone create() {
        final AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
        final NavegadorInternet navegadorInternet = new NavegadorInternetImpl();
        final ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
        return new Phone(aparelhoTelefonico, navegadorInternet, reprodutorMusical);
    }
}
