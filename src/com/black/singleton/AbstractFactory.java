package com.black.singleton;

import com.black.singleton.BaseFactory;

public class AbstractFactory {

    public static BaseFactory getFactory(String string) throws IllegalColorException {

        if (string.equalsIgnoreCase("white"))   return new WhiteFactory();
        if (string.equalsIgnoreCase("black"))   return new BlackFactory();

        // if neither white nor black
        throw new IllegalColorException();
    }
}
