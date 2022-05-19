package Orientacao_A_Obejetos_Parte_2.o_objeto_this;

import Orientacao_A_Objetos_Parte_1.composicao_de_objetos.Proprietario;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alterarModelo(String modelo){
        if (modelo != null){
            this.modelo = modelo;
        }
    }

}
