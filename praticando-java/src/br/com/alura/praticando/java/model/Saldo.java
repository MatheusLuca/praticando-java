package br.com.alura.praticando.java.model;

public class Saldo {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void zerarSaldo(){
        this.saldo = 0.0;
    }
}
