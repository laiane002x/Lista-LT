package Patinete;

public class Aluguel {

//tenta destravar o patinete pro cliente
    public void destravar(Patinete p, Cliente c) {

//verifica se a bateria ta ok
        if (p.bateria<20) {
            throw new BateriaFraquinha("vix bateria fraca viu..ta em " + p.bateria + "%");
        }

//verifica se o patinete ta livre
        if (p.usando) {
            throw new VeiculoOcupado("patinete ocupado por outra pessoa, espera ai");
        }

//so chega aq se passou nas 2 verificacoes
        p.usando = true;
        c.viagemAberta = true;
        System.out.println("#destravouu tempo iniciado.");
    }
}

