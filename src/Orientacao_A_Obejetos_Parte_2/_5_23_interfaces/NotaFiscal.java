package Orientacao_A_Obejetos_Parte_2._5_23_interfaces;

public class NotaFiscal implements Imprimivel, EnviarPorEmail {

    private int numero;

    public NotaFiscal(int i) {
    }

    public void adicionarPedido(String produto){
        
    }
    @Override
    
    public void imprimir(){
        System.out.println("vamos imprimir essa nota fiscal de numero: " + numero);
    }

    @Override
    public void enviar(String email) {

        System.out.println("Enviando a nota de numero: " + numero + "para o email: " + email);

    }
}
