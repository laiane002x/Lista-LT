package caixa;

import caixa.exceptions.Faltacelulas;
import caixa.exceptions.SaldoInsuficiente;

public class Cliente {

    double money;

    public Cliente(double moneyInicial) {
        this.money = moneyInicial;
    }

    // realiza o saque na conta do cliente
    public void saque(double valor, CaixaEletro caixaEletro) throws Faltacelulas, SaldoInsuficiente {

        // verifica se o cliente tem saldo
        if (valor > money) {
            throw new SaldoInsuficiente("Saldo insuficiente! Voce tem: R$" + money);
        }

        // reserva o valor
        money = money - valor;

        try {
            caixaEletro.sacar(valor);

        } catch (Faltacelulas e) {
            // devolve o saldo se o caixa nao tiver cedulas
            money = money + valor;
            throw e;
        }
    }
}
