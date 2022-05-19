package Orientacao_A_Obejetos_Parte_2.o_objeto_this;

public class Exemplo {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";
        System.out.println("Modelo antes: " + carro.modelo);
        carro.alterarModelo("Civic");
    }

}
