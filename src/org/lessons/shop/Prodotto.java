package org.lessons.shop;

import java.math.BigDecimal;

public class Prodotto {

    private int codice;
    private String[] nome;
    private String[] marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(int codice, String[] nome, String[] marca, BigDecimal prezzo, BigDecimal iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public String[] getMarca() {
        return marca;
    }

    public void setMarca(String[] marca) {
        for (int i = 0; i < marca.length; i++) {
            this.marca[i] = "Marca: " + marca[i];
        }
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

}
