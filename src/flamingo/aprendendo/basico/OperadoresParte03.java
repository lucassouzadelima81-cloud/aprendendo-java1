package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    static void main(String[] args) {
        /*
        * && and -> e
        * || or -> ou
        * ! not -> não
        **/

        byte idade = 18;
        boolean isCNH = true;

        boolean isEstaNaLeiParaDirigir = idade >= 18 && isCNH == true;

        System.out.println(isEstaNaLeiParaDirigir);
    }
}
