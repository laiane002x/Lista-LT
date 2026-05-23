package Estufa;

public class Main {
    public static void main(String[] args) {

        SensorTemp sensor = new SensorTemp();
        Estufa estufa = new Estufa();

        try {
            double leitura = sensor.verTemp();
            estufa.ajustarClima(leitura);

        } catch (LeiIncons e) {
            System.out.println("sensor fuleiro--> " + e.getMessage());

        } catch (ErroAtuado e) {
            System.out.println("equipamento fuleiro--> " + e.getMessage());
        }
        finally {

// roda roda for ever, dando erro sim ou nao
            System.out.println("log--> monitoramento acabousse:)");
        }
    }
}
