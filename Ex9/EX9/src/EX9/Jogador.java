package EX9;



public class Jogador {
   public String nome;
   public int peso;
   public String posição;
   public double altura;
   public int dt;
   public String dt_nascimento;
   public String nacionalidade;
   private int ap_atc=0;
   private int ap_df=0;
   private int ap_me=0;
   

   

   public String dados(){
    String dados_jogador=(nome+posição+dt_nascimento+nacionalidade+altura+peso);
    return dados_jogador;
   }

    public int idade(){
        int idade_jogador=2022-dt;
        return idade_jogador;
 
    }
    public int aposentadoria_defesa(){
        if (posição=="defesa"){
            if (2022-dt<=40){
                ap_df=40+dt-2022;
                
            }
        }
        return ap_df;
        }
        public int aposentadoria_ataque(){
            if (posição=="ataque"){
                if (2022-dt<=35){
                    ap_df=35+dt-2022;
                    
                }
            }
            return ap_atc;
    }
   
        public int aposentadoria_meia(){
            if (posição=="meia"){
                if (2022-dt<=38){
                    ap_df=38+dt-2022;
                    
                }
            }
            return ap_me;
        
        }
    }
                

