package EX10;
public class Ingresso {
    private int ingresso_normal=50;
    public int op;

    

    public int ingressoNormal(){
        return (ingresso_normal)/50;
    }
    public int ingressoVip(){
        return (ingresso_normal+10)/60;
    }

}
