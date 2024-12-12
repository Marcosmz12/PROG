package utilidades;

public class GeneradorAleatorio {
    
    /**
     * @param carta 
     * El parametro carta hace que aleatoriamente salga un numero de 1 al 40
     */
    public static int generarCarta(){
        int carta = (int) (Math.random() * 40) +1;
        return carta;
    }

    /**
     * @param dado
     * El parametro dado hace que aleatoriamente salga un numero de 1 al 6
     */
    public static int generarDado(){
        int dado = (int)(Math.random()*6)+1;
        return dado;
    }
}
