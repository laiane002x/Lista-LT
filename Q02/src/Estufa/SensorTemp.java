package Estufa;

public class SensorTemp {

//um simulador d leitura do sensor
    public double verTemp()
        throws LeiIncons{
        double leitura = 150;

//valores fora do range nao funcionam aq
        if (leitura > 80 || leitura < -10) {
            throw new LeiIncons("Valor fora do range: " + leitura + "C");
        }
        return leitura;
    }
}

