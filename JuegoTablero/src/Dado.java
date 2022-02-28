import java.util.Random;

public class Dado {
    private int caras = 0;
    private int number;
    private Random rnd = new Random();

    public Dado(int numCaras){
        caras = numCaras;
    }
        
    public int lanzar(){
        number = rnd.nextInt(caras) + 1;
        return number;
    }
}
