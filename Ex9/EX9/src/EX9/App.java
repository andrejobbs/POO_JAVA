package EX9;
public class App {
    public static void main(String[] args) throws Exception {
        Jogador objetoJogador = new Jogador();
        objetoJogador.nome="André ";
        objetoJogador.altura=1.81;
        objetoJogador.dt_nascimento=" 01/01/2001 ";
        objetoJogador.nacionalidade=" BR ";
        objetoJogador.dt=2001;
        objetoJogador.posição="defesa";
        objetoJogador.peso=78;
        String dados=objetoJogador.dados();
        System.out.println(dados);
        int calcular_idade=objetoJogador.idade();
        System.out.println("A idade do jogador é:"+calcular_idade);
        int ap_atc=objetoJogador.aposentadoria_ataque();
        System.out.println("A idade restante para aposentadoria do atacante é:"+ap_atc);
        int ap_me=objetoJogador.aposentadoria_meia();
        System.out.println("A idade restante da aposentadoria do meia é:"+ap_me);
        int ap_df=objetoJogador.aposentadoria_defesa();
        System.out.println("A idade restante da aposentadoria do defensor é:"+ap_df);

    }
}
