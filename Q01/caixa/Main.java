package caixa;

import caixa.exceptions.Faltacelulas;
import caixa.exceptions.SaldoInsuficiente;

public class Main {

    public static void main(String[] args) {

        CaixaEletro caixa = new CaixaEletro(200.0, 3);
        Cliente conta = new Cliente(500.0);

        try {
            conta.saque(300, caixa);

        } catch (SaldoInsuficiente e) {
            System.out.println("erro --> " + e.getMessage());

        } catch (Faltacelulas e) {
            System.out.println("erro --> " + e.getMessage());
        }

        System.out.println("Saldo final: R$" + conta.money);
    }
}
