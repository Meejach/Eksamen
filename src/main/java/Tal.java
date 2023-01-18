import java.util.ArrayList;
import java.util.Random;

public class Tal {
    Random random = new Random();
    ArrayList <Integer> listeAfTal = new ArrayList<>();
    public int retunerEtTal (){
        int tilfældigTal = random.nextInt(5) + 1 ;
        return tilfældigTal;
    }

    public void lavMangeTal () {
        for (int i = 0; i < 10; i++) {
            listeAfTal.add(retunerEtTal());
        }
    }

    public ArrayList <Integer> getTilfældigeTal(){
        return listeAfTal;
    }
}
