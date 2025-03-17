package org.lessons.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private String[] colori;
    private boolean cablate;

    public Cuffie (int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String[] colori, boolean cablate) {
        super(codice, nome, marca, prezzo, iva);
        this.colori = colori;
        this.cablate = cablate;
    }

    public String[] getColori() {
        return colori;
    }

    public void setColori(String[] colori) {
        this.colori = colori;
    }

    public boolean isCablate() {
        return cablate;
    }

    public void setCablate(boolean cablate) {
        this.cablate = cablate;
    }

}
