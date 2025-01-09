public class Desplazo {
    public static void desplazar (int[] n , int posOg , int posDes){
        int aux = n[posOg];
        for (int i = posOg; i > posDes; i--) {
            n[i] = n[i -1];
        }
        n[posDes] = aux;
    } 

}
