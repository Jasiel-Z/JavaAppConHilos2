package Ejemplo2;

public class Corredor implements Runnable{
    private String avance;
    private long latencia;
    private char c;

    public Corredor(char c){
        this.avance = "";
        this.latencia = (long) (Math.random() * 100);
        this.c = c;
    }

    public void run(){
        for(int i = 0; i < 50; i++){
            avance = avance + c;
            System.out.println(avance);

            try{
                Thread.sleep(latencia);

            }catch( InterruptedException ex){
                ex.printStackTrace();
            }
        }
        avance = avance + "terminé!!!";
        System.out.println(avance);
        
    }

}