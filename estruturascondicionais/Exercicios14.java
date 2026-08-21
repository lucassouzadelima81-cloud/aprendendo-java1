package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicios14 {
    static void main(String[] args) {
        boolean emailCorreto = true;
        boolean senhaCorreta = true;

        if (emailCorreto = senhaCorreta = true){
            System.out.println("login realizado com susseso");
        } else if (emailCorreto = senhaCorreta = false) {
            System.out.println("email e senha invalidos");
        }
    }
}
