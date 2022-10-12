package ExercicioMetodo;

public class Main {

    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(5,6);
        Calculadora.multiplicacao(10,5);
        Calculadora.divisao(100,5);
        Calculadora.subtracao(80,20);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem( 13);
        Mensagem.obterMensagem( 8);
        Mensagem.obterMensagem( 22);
        Mensagem.obterMensagem( 2);

        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Empréstimo.calcular(1000, Empréstimo.getDuasParcelas());
        Empréstimo.calcular(1000, Empréstimo.getTresParcelas());
        Empréstimo.calcular(1000, 5);

        //Quadrilátero
        System.out.println("Cálculo do Quadrilátero");
        Quadrilatero.area(2);
        Quadrilatero.area(5d,6d);
        Quadrilatero.area(5,2,8);
        Quadrilatero.area(5f,6f);

        //Quadrilátero Return
        System.out.println("Exercício Retorno");
        //consigo guardar os valores dentro de variantes
        double areaQuadrado = QuadrilateroReturn.area(2);
        System.out.println("Área Quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroReturn.area(5,8);
        System.out.println("Àrea Retangulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroReturn.area(6,5,2);
        System.out.println("Área do Trapézio: " + areaTrapezio);



    }

    public static void outro() { //da pra retornar mesmo quando é void só que serve para finalizar

        System.out.println("Antes");
    }

    //public static double abc() {
    // return 1.6; // tem que ser compativel com o tipo, nesse caso nao pode ser float por exemplo
}

