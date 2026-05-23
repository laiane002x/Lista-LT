package Patinete;

public class Main {

  public static void main(String[] args) {

    Patinete p = new Patinete();
    Cliente c = new Cliente();
    Aluguel aluguel = new Aluguel();

    try {
      aluguel.destravar(p, c);

    } catch (BateriaFraquinha e) {
      System.out.println("erro--> " + e.getMessage());

    } catch (VeiculoOcupado e) {
      System.out.println("erro--> " + e.getMessage());
    }
  }
}
