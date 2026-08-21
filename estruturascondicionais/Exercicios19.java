package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios19 {
    static void main() {
       byte valorCompra = 100;;

       if (valorCompra >= 150){
           System.out.println("frete grátis");
       } else if (valorCompra < 150) {
           System.out.println(" frete de R$20,00");
       }
    }
}
