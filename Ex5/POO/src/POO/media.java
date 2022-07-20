package POO;

//Classe que representa uma pessoa
public class media {

    //Atributos de uma pessoa, necess�rios para a resolu��o do problema
    public String nome;
    public int matricula=0;
    public double nota_1=0;
    public double nota_2=0;
    public double nota_trabalho=0;
    


    //Construtor
    

    
    //A��o que a pessoa pode executar
    public double calcular_nota(){

        return ((nota_1+nota_2)*2.5+nota_trabalho*2)/7;
    }
    public double media_final(){
        double calcular_nota=calcular_nota();
        if (calcular_nota<2.5|| calcular_nota>=5);
            return 0;

        
    }

}
