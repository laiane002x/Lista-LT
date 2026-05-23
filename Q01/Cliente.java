package caixa;

public class Cliente{
    double money;

    public Cliente(double moneyInicial){
        this.money = moneyInicial;
    }

//realiza o saque na conta do cabinha
    public void saque(double valor, CaixaEletro caixaEletro)
            throws SemSaldo, SemMoney {

//verifica se o caba tem saldo
        if(valor>money) {
            throw new SemSaldo("vc eh liso! Voce so tem" + money + "kkkkkkkkkk e tentou sacar " + valor);
        }

//cofrinho do valor
        money= money-valor;

        try {
            caixaEletro.sacar(valor);
        }

        catch (SemMoney e){

//devolve o saldo se o caixa nao tiver notas
            money= money+valor;
            throw e;
        }
    }
}
