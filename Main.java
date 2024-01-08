import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        RelogioDigital meuRelogio = 
            new RelogioDigital(23, 58, 50);
    
        try {
            //Faz o java "dormir" por um segundo
            int count = 0;
            while(count != 1000){
                meuRelogio.executaTempo();
                System.out.println(meuRelogio.textoRelogio());
                TimeUnit.SECONDS.sleep(1);
                count ++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
