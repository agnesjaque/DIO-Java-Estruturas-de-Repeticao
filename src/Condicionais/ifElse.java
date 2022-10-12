package Condicionais;

public class ifElse {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >=5 && nota <7)
            System.out.println("Recuperação");
            
        else // aqui a condição é caso a primeira não foi atendida
            System.out.println("Reprovado");

        int nota2 = 7; //ternário sem usar ifelse
        String resultado = nota2 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        int nota3 = 6; //ternário sem usar elseif
        String resultado2 = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }
}
