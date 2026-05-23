package caixa;

import caixa.exceptions.Faltacelulas;
import caixa.exceptions.SaldoInsuficiente;

public class CaixaEletro {

    public double saldo;
    public int c10;

    public CaixaEletro(double saldo, int c10) {
        this.saldo = saldo;
        this.c10 = c10;
    }

    public void sacar(double valor) throws SaldoInsuficiente, Faltacelulas {

        // verifica se tem saldo suficiente
        if (valor > saldo) {
            throw new SaldoInsuficiente("Saldo insuficiente! Saldo: R$" + saldo);
        }

        // reserva o valor do saldo
        saldo = saldo - valor;
        System.out.println("Saldo reservado. Saldo atual: R$" + saldo);

        // verifica se tem cedulas suficientes
        int cNess = (int) (valor / 10);
        if (c10 < cNess) {

            // devolve o saldo se nao tiver cedulas
            saldo = saldo + valor;
            System.out.println("Saldo devolvido. Saldo restaurado: R$" + saldo);
            throw new Faltacelulas("Falta de cedulas! Tem: " + c10 + " precisa: " + cNess);
        }

        // faz o saque
        c10 = c10 - cNess;
        System.out.println("Saque de R$" + valor + " realizado!");
        System.out.println("Notas restantes no caixa: " + c10);
    }
}
