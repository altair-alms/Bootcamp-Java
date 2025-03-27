package org.example.modificardor;

public class Conta {
    private double saldo;
    private String titular;

    public Conta(Double saldo){
        this.saldo = saldo;

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;

    }

    public String getTitular() {
        return titular;
    }
}
