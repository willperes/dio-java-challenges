package com.willperes.iphone.factory;

import com.willperes.iphone.abstraction.AparelhoTelefonico;
import com.willperes.iphone.abstraction.NavegadorInternet;
import com.willperes.iphone.abstraction.ReprodutorMusical;
import com.willperes.iphone.model.AparelhoTelefonicoImpl;
import com.willperes.iphone.model.NavegadorInternetImpl;
import com.willperes.iphone.model.Phone;
import com.willperes.iphone.model.ReprodutorMusicalImpl;

public class PhoneFactory {
    public static Phone create() {
        final AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
        final NavegadorInternet navegadorInternet = new NavegadorInternetImpl();
        final ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
        return new Phone(aparelhoTelefonico, navegadorInternet, reprodutorMusical);
    }
}
