package com.aitrich.bookmyshowclone.Domain;

public enum Formats {

    TWO_D("2D"),
    THREE_D("3D"),
    FOUR_DX("4DX"),
    IMAX("IMAX");

    private final String label;

    Formats(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
