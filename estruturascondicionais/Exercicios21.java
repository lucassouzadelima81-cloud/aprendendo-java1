package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios21 {
    static void main(String[] args) {
        byte idade = 17;
        String categoria;
        
        if (idade < 12) {
            categoria = "categoria criança";
        } else if (idade <17) {
           categoria = "categoria adolecente";

        } else if (idade >18) {
            categoria = "categoria adulto";
        } else {
            categoria = "categoria idoso";
        }
        System.out.println(categoria);
    }
}
