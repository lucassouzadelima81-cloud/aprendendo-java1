package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios20 {
    static void main(String[] args) {
        boolean temPermisao = true;

        if (temPermisao = true){
            System.out.println("acesso liberado");
        } else if (temPermisao = false) {
            System.out.println("acesso negado");
        }
    }
}
