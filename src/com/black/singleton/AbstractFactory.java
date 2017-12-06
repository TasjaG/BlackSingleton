package com.black.singleton;

class AbstractFactory {
    static BaseFactory getFactory(String data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Color must not be null");
        }
        BaseFactory baseFactory;
        String color = data.toUpperCase();
        if ("BLACK".equals(color)) {
            baseFactory = new BlackFactory(color);
        } else if ("WHITE".equals(color)) {
            baseFactory = new WhiteFactory(color);
        } else {
            throw new IllegalArgumentException("Color '" + color + "' doesn't exist");
        }
        return baseFactory;
    }
}
