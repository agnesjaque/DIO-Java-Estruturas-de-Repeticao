package Condicionais;

public class CaixaEletronico {
    public static void main(String[] args) {

        //if é usando somente quando a condição for positiva
        double saldo = 25.0;
        double valorSolicitado = 24.0; // se o valor for maior, retorna o valor inicial de saldo

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println("O saldo da conta é: R$" + saldo);
    }
}
