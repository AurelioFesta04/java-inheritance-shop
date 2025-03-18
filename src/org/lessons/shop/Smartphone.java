package org.lessons.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    protected String imei;
    protected String memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, String imei, String memoria) {
        super(nome, marca, prezzo);
        this.imei = imei;
        this.memoria = memoria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodice IMEI: " + getImei() + "\nMemoria: " + getMemoria();
    }

}