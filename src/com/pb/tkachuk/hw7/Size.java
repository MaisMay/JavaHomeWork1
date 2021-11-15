package com.pb.tkachuk.hw7;

public enum Size {

    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private String description;
    private int size;

    Size(String description, int size) {
        this.description = description;
        this.size = size;
    }

    public String getDescription(){
        return this.description;
    }

    public int getEuroSize() {
        return this.size;
    }
}