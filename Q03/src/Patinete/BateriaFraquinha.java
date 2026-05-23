package Patinete;

//estoura quando a bateria ta baixa demais(10%)

public class BateriaFraquinha extends RuntimeException{

    public BateriaFraquinha(String mensagem){
        super(mensagem);
    }
}
