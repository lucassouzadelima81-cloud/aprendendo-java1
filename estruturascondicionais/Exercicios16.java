package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios16 {
    public static void main(String[] args) {
            double valorCompra = 250.00;

        if (valorCompra >= 200.00) {
                double valorFinal = valorCompra * 0.90;
                System.out.println("Valor com desconto: R$ " + valorFinal);
        } else {
                System.out.println("Valor original: R$ " + valorCompra);
        }
    }


}

