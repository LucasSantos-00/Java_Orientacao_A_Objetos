package Orientacao_A_Obejetos_Parte_2._5_23_interfaces;

public class TesteInterface {

    public static void main(String[] args) {

        Imprimivel i = new NotaFiscal(1234);

        i.imprimir();
        EnviarPorEmail e = (EnviarPorEmail) i;e.enviar("pcdo3esquerda@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("caixa de leite");

    }
}