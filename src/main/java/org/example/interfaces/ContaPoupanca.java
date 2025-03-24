package org.example.interfaces;

public class ContaPoupanca implements Conta{
    private double saldo = 100.00;

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public void sacar(double saldo) {
            this.saldo -= saldo;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
