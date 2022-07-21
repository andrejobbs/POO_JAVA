package EX10;

import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
        Ingresso objetoIngresso=new Ingresso();
        System.out.println("1.Ingresso comum");
        System.out.println("2.Ingresso vip");
        objetoIngresso.op=leitor.nextInt();
        if (objetoIngresso.op==1){
            int ingresso_normal=objetoIngresso.ingressoNormal();
            System.out.println(ingresso_normal+" Ingresso normal");

        }
        if (objetoIngresso.op==2){
            int ingresso_vip=objetoIngresso.ingressoVip();
            System.out.println(ingresso_vip+" Ingresso vip");   
        }
       if ((objetoIngresso.op!=1) && (objetoIngresso.op!=2)){
            System.out.println("Operação invalida");
         

}
}
}
}