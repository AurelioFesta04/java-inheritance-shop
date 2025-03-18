package org.lessons.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

    protected String dimensioni;
    protected Boolean smart;

    public Televisori(String nome, String marca, BigDecimal prezzo, String dimensioni, Boolean smart) {
        super(nome, marca, prezzo);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public String getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public Boolean getSmart() {
        return smart;
    }

    public void setSmart(Boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDimensioni :" + getDimensioni() + "\nSmart :" + getSmart();
    }

}