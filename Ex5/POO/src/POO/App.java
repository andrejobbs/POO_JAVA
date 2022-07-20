package POO;

public class App {

    public static void main(String[] args) {
        media objetoMedia = new media();
        
        objetoMedia.nome="André";
        objetoMedia.matricula=123;
        objetoMedia.nota_1=70;
        objetoMedia.nota_2=60;
        objetoMedia.nota_trabalho=60;

        double media =objetoMedia.calcular_nota();

        System.out.println("Nome:"+objetoMedia.nome+" Media:"+media+" N°Matricula:"+objetoMedia.matricula);

        double media_final=objetoMedia.media_final();
        System.out.println(media_final);

        
        


    }
}