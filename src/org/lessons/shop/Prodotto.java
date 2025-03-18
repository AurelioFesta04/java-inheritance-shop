package org.lessons.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class Prodotto {

    private static final Random random = new Random();

    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    private BigDecimal cartaFedelta;

    public Prodotto(String nome, String marca, BigDecimal prezzo) {
        this.codice = Prodotto.random.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22);
        this.cartaFedelta = new BigDecimal(0.02);
    }

    public Prodotto(String nome, BigDecimal prezzo, BigDecimal iva, BigDecimal cartaFedelta) {
        this.codice = Prodotto.random.nextInt(999999);
        this.nome = nome;
        this.marca = "N/A";
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22);
        this.cartaFedelta = new BigDecimal(0.02);
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzoBase() {
        return prezzo;
    }

    public void setPrezzoBase(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public BigDecimal getPrezzoIvato() {
        if (prezzo != null && iva != null) {
            return this.prezzo.add(this.prezzo.multiply(this.iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public BigDecimal getCartaFedelta() {
        return cartaFedelta;
    }

    public BigDecimal getPrezzoScontato() {
        if (prezzo != null && cartaFedelta != null) {
            return this.prezzo.subtract(this.prezzo.multiply(this.cartaFedelta)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    @Override
    public String toString() {
        if (nome != null) {
            return getCodice() + " - " + getNome();
        }
        return null;
    }

}