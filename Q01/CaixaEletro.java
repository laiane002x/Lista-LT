package caixa;

public class CaixaEletro {

    public double saldo;
    public int c10;

    public CaixaEletro(double saldo, int c10) {
        this.saldo = saldo;
        this.c10 = c10;
    }

    public void sacar(double valor) throws SemSaldo, SemMoney {

// verifica se tem saldo suficiente
        if (valor > saldo) {
            throw new SemSaldo("irmao vc eh liso! vc so tem " + saldo + " e tentou sacar kkkkkkkk" + valor);
        }

//reserva o valor do saldo
        saldo = saldo - valor;

        // verifica se tem cedulas suficientes
        int cNess = (int) (valor / 10);
        if (c10 < cNess) {

//devolve o saldo se nao tiver cedulas
            saldo = saldo + valor;
            throw new SemMoney("irmao cade o pix?! o caixa so tem " + c10 + " pilas, faz o pix de " + cNess);
        }

//faz o saque
        c10 = c10 - cNess;
        System.out.println("brocouuu saque de " + valor + " feito:)");
        System.out.println("notas q ficou no caixa " + c10);
        System.out.println("o saldo q ficou R$" + saldo);
    }
}
