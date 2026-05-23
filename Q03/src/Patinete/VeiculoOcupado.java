package Patinete;

//estoura quando o patinete ja ta sendo usado por outra pessoa
public class VeiculoOcupado extends RuntimeException{

    public VeiculoOcupado(String mensagem){
        super(mensagem);
    }
}
