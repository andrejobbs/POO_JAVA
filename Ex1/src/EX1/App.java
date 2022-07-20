package EX1;

public class App {

    public static void main(String[] args) {
        Pessoa objetoPessoa = new Pessoa();
        int calcular_idade=objetoPessoa.idade();
        System.out.println(calcular_idade+" ANOS");
        String ver_dados=objetoPessoa.dados();
        System.out.println(ver_dados);
    }
}