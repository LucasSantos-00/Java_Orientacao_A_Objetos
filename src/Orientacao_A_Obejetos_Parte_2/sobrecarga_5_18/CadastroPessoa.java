package Orientacao_A_Obejetos_Parte_2.sobrecarga_5_18;

public class CadastroPessoa {

    public void cadastrar(Pessoa pessoa) {

        armazenar(pessoa.getNome(), pessoa.getIdade());

    }

    public void cadastrar(String nome, int idade) {

        armazenar(nome, idade);

    }

    public void cadastrar(String nome) {

        armazenar(nome, 0);

    }

    private void armazenar(String nome, int idade) {

        System.out.print("Salvando: " + nome + " com " + idade + " anos ");

    }


}
