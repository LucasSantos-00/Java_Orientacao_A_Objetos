package class_abstrata_20_05;

public class ProdutoPerecivel extends Produto {

    String dataDeVAlidade;
    @Override

    public void imprimirDescricao(){

        System.out.println("descricao " + super.getDescricao() + "vencimento em " + dataDeVAlidade );

    }



}
