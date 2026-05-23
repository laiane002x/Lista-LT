package caixa;

public class Main {

    public static void main(String[] args) {

        CaixaEletro caixa = new CaixaEletro(500, 5);
        Cliente conta = new Cliente(400);

        try {
            conta.saque(300, caixa);

        } catch (SemSaldo e) {
            System.out.println("erro--> " + e.getMessage());

        } catch (SemMoney e) {
            System.out.println("erro--> " + e.getMessage());
        }

        System.out.println("teu saldo eh--> " + conta.money);
    }
}
