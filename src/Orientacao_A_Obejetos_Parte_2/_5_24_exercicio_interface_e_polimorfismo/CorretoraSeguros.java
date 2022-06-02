package Orientacao_A_Obejetos_Parte_2._5_24_exercicio_interface_e_polimorfismo;

public class CorretoraSeguros {

    public void fazerPropostaSegura(Seguravel objetoSeguravel) {

        System.out.println("----------------------------------------------|");
        System.out.println("Corretora de seguros & proposta");
        System.out.println("----------------------------------------------|");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da apolice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("----------------------------------------------|");

    }
}