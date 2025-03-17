package org.lessons.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private String[] imei;
    private String[] memoria;

    public Smartphone(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String[] imei, String[] memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    public String[] getImei() {
        return imei;
    }

    public void setImei(String[] imei) {
        for (int i = 0; i < imei.length; i++) {
            imei[i] = "Codice IMEI: " + imei[i];
        }
        this.imei = imei;
    }

    public String[] getMemoria() {
        return memoria;
    }

    public void setMemoria(String[] memoria) {
        for (int i = 0; i < memoria.length; i++) {
            memoria[i] = "La memoria interna è di " + memoria[i] + " GB";
        }
        this.memoria = memoria;
    }

}
