package OperadoresMatematicos;

public class Operadores {
    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();


    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 = 580

        System.out.println("i++ + --j * k = " + a);
        System.out.println("i = " + i);

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1
        System.out.println("k / --i % 3 + 1 = " + b);
        System.out.println("i: " + i);

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 -> 2 * 10 + 5 -> 2 * 15; 30

        System.out.println("c *= i += 5: " + c);
    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println(d);

        i += 5; // i = i +5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;

        int soma = a + b;
        int sub = a - b;
        int div = a / b;
        int mult = a * b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Divisão: " + div);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Resto: " + resto);
    }

    private static void prePos() {

        int i = 10;

        int j = ++i;
        int l = --i;
        int k = i++;
        int m = i--;
        int x = i;

        System.out.println("j: " + j);
        System.out.println("l: " + l);
       System.out.println("k: " + k);
       System.out.println("m: " + m);
        System.out.println("x: " + x);

    }
}
