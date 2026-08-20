package flamingo.aprendendo.basico;

public class estruturasCondicionaisParte02 {
    static void main(String[] args) {
//        byte idade = 17;
//        if (idade >= 18){
//            System.out.println("pode comprar bebida alcoólica");
//        }else {
//            System.out.println("não pode comprar bebida alcoólica");
//        }

        byte idade = 16;
        String categotia;
        // < 15 - infantil
        // >= 15 && < 18 - juvenil
        // >= 18 - Adulto

        if (idade < 15) {
            categotia = "categotia infantil";
        } else if (idade <18) {
            categotia = "categotia juvenil";
        }
        else {
            categotia = "categotia adulta";
        }
        System.out.println(categotia);
    }
}
