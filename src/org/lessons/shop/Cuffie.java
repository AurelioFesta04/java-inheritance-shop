package org.lessons.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    protected String colori;
    protected boolean cablate;

    public Cuffie(String nome, String marca, BigDecimal prezzo, boolean cartaFedelta, String colori, boolean cablate) {
        super(nome, marca, prezzo, cartaFedelta);
        this.colori = colori;
        this.cablate = cablate;
    }

    public String getColori() {
        return colori;
    }

    public void setColori(String colori) {
        this.colori = colori;
    }

    public boolean isCablate() {
        return cablate;
    }

    public void setCablate(boolean cablate) {
        this.cablate = cablate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColore : " + getColori() + "\nCablate : " + isCablate();
    }

}