package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios13 {
    static void main(String[] args) {
        int saldo = 300;
        int valorProduto = 200;
        if (saldo >= valorProduto){
            System.out.println("compra aprovada");
        } else if (saldo < valorProduto) {
            System.out.println("saldo insuficiente");
        }
    }
}
