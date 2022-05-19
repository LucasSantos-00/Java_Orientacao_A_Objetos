package Orientacao_A_Obejetos_Parte_2.sobrecarga_5_18;

public class TesteCadastro {

    public static void main(String[] args) {

        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("Jose", 32);
        cadastro.cadastrar(pessoa);

    }
}
