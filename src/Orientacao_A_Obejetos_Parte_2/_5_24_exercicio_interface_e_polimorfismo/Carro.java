package Orientacao_A_Obejetos_Parte_2._5_24_exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel {

    private Integer anoFabricacao;
    private Double valorMercado;


    public Carro(Integer anoFabricacao, Double valorMercado) {
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Carro Ano: " + this.anoFabricacao + " com valor de mercado de: " + this.valorMercado;
    }
}