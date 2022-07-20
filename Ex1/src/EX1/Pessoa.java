package EX1;



public class Pessoa {

    private String nome="André";
    private String data_nasc="01/01/2001";
    private int data=2001;
    private double altura=1.81;

    public int idade (){
        int calcular_idade=2022-data;
        return calcular_idade;

    }
    
    public String dados(){
        String ver_dados=(nome+" "+data_nasc+" "+altura);
        return ver_dados;

    }
}
