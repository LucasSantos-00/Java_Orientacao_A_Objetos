package Orientacao_A_Obejetos_Parte_2._5_24_exercicio_interface_e_polimorfismo;

public class Imovel implements Seguravel {

    private Double valorDemercardo;
    private Double areaContruida;

    public Imovel(Double valorDemercardo, Double areaContruida) {
        this.valorDemercardo = valorDemercardo;
        this.areaContruida = areaContruida;
    }

    @Override
    public String obterDescricao() {
        return "Imovel com area de construcao de: " + this.areaContruida + " Metros " + "Com o valo de mercado de: " + this.valorDemercardo;
    }

    @Override
    public double calcularValorApolice() {

        double valorApolice = this.valorDemercardo * 0.003;
        valorApolice = valorApolice + (areaContruida * 0.5);
        return valorApolice;

    }
}