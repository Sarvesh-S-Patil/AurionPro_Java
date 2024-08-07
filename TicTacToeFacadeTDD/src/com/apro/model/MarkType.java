package com.apro.model;

public enum MarkType {
    EMPTY(" "),  // Represent empty cells with a space
    X("X"), 
    O("O");

    private final String symbol;

    MarkType(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

}
