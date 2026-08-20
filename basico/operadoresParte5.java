package flamingo.aprendendo.basico;

public class operadoresParte5 {
    static void main(String[] args) {
        // Operadores de atribuição

        /*
        * = atribuição simples
        * += soma e atribuir
        * -= subtração e atribuição
        * *= multiplicação e atribuição
        * /= divição e atribuição
        * %= resto da divisão e atribuição
        * **/


        double totalCompra = 0;

        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50;

        totalCompra /= 2;

        System.out.printf("total da compra = %.2f", totalCompra);
    }
}
