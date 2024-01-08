public class RelogioDigital {
    private int hora;
    private int minuto;
    private int segundo;

    public RelogioDigital(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void executaTempo(){
        segundo++;
        if(segundo == 60){
            minuto++;
            segundo = 0;
            if(minuto == 60){
                hora++;
                minuto = 0;
                if(hora == 24){
                    hora = 0;                    
                }
            }
        }
    }

    public String textoRelogio(){
        return hora + ":" + minuto + ":" + segundo;
    }
}
