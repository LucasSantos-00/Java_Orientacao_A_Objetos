package Orientacao_A_Obejetos_Parte_2.enumeracoes_5_12_Enum;

public enum Naipe {

    OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");
    private String cor;
    Naipe(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

}
