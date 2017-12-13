package com.black.singleton;

public class AbstractFactory {

    public static BaseFactory getFactory(String factoryType) throws IllegalColorException {

        if (factoryType.equalsIgnoreCase("white"))
            return new WhiteFactory();
        if (factoryType.equalsIgnoreCase("black"))
            return new BlackFactory();

        // if neither white nor black
        throw new IllegalColorException();
    }
}
