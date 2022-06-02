package Orientacao_A_Obejetos_Parte_2.class_abstrata_20_05;

public class testeclasseAbstrata {

    public static void main(String[] args) {

        Produto p = new ProdutoPerecivel();

        p.descricao = "caixa de jair ";

        ProdutoPerecivel pp = (ProdutoPerecivel) p;
        pp.dataDeVAlidade = "33/33/33";

        p.imprimirDescricao();

    }
}
