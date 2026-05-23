package Estufa;

public class Estufa {

//apita o equipamento certo pra temp lida
    public void ajustarClima(double leitura) throws ErroAtuado{

       if (leitura > 30) {


//ventilador sempre com defeito
          throw new ErroAtuado("seu ventilador veio la do paraguay.. ou seja nao ligou:(");
       }
       else if(leitura < 18) {
          System.out.println("aquecedor funcionando");
       }
       else{
           System.out.println("clima di boaaaa :)");
            }
        }
    }

