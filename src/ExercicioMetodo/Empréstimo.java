package ExercicioMetodo;

public class Empréstimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return  0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }
    public static void calcular (double valor, double parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor + getDuasParcelas();
            System.out.println("Valor final para duas parcelas é: R$ " + valorFinal);
        } else if (parcelas == 3) {


        double valorFinal = valor + getTresParcelas();

        System.out.println("Valor final para três parcelas é: R$ " + valorFinal);
        }else    {
        System.out.println("Quantidade de parcelas não aceita");
    }
}}
