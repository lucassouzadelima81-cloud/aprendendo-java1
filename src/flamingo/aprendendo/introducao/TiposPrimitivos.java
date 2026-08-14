package flamingo.aprendendo.introducao;

public class TiposPrimitivos {
    static void main(String[] args) {
        //byte: Usa 8 bits. Guarda de -128 até 127.
        //short: Usa 16 bits. Guarda de -32.768 até 32.767.
        //int: Usa 32 bits. Guarda de mais ou menos -2 bilhões até 2 bilhões. É o padrão para números inteiros.
        //long: Usa 64 bits. Guarda números inteiros muito grandes.
        short idade = 19;
        int municipio = 2000000000;
        long contaBancaria = 999999999999999999L;
        float salario = 15000.93f;
        double salarioExtra = 2500.50;
        char primeiraLetraDoNome = 'Y';
        boolean vaiEstudarNasFerias = false;
        System.out.println(vaiEstudarNasFerias);
        System.out.println(" PL caiu = " + salarioExtra);
        System.out.println("Minha idade é: " + idade);
        System.out.println(" Essa cidade tem: " + municipio + " de moradores");
        System.out.println("Minha conta daqui a 2 anos " + contaBancaria );
        System.out.println(" Meu salario depois de estudar com o bigas é: " + salario);
        System.out.println("Primeira letra do meu nome é: " + primeiraLetraDoNome);

    }
}
