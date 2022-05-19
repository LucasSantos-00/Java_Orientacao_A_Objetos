package Orientacao_A_Objetos_Parte_1.Execicio_02;

public class Caminhada {

    public void andar(Pessoa pessoa) {
        System.out.println("Eu \"" + pessoa.nome + "\""
                + " estou andando com o \"" + pessoa.cachorro.nome + "\"");
    }

}
