package org.lessons.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    
    private String[] dimensioni;
    private Boolean smart;

    public Televisori(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String[] dimensioni, Boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public String[] getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(String[] dimensioni) {
        for (int i = 0; i < dimensioni.length; i++) {
            this.dimensioni[i] = "Lo schermo del televisore è grande " + dimensioni[i] + " pollici";
        }
        this.dimensioni = dimensioni;
    }

    public Boolean getSmart() {
        return smart;
    }

    public void setSmart(Boolean smart) {
        this.smart = smart;
    }

}
