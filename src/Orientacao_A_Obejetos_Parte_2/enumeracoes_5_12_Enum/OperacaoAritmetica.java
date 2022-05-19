package Orientacao_A_Obejetos_Parte_2.enumeracoes_5_12_Enum;

public enum OperacaoAritmetica {
    ADICAO{
        @Override
        public int operacao(int x, int y) {
            return x + y;
        }
    }, SUBTRACAO {
        @Override
        public int operacao(int x, int y) {
            return x - y;
        }
    };
    public abstract int operacao(int x, int y);
}