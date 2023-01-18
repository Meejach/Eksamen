import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {

    private int antalTerninger;

    private ArrayList<Integer> terningernesØjne= new ArrayList();

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
    }

    public int ryst(){
        int samletAntalØjne = 0;
        for (int terning = 0; terning < antalTerninger; terning++) {
            Random random = new Random();
            int slag = random.nextInt(6) + 1 ;
            System.out.println(slag);
            samletAntalØjne += slag;
            terningernesØjne.add(terning,slag);
        }
        return samletAntalØjne;
    }

    public ArrayList<Integer> se() {
        System.out.println(terningernesØjne.toString());

        return terningernesØjne;
    }

}
