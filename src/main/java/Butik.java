import java.util.ArrayList;

public class Butik {

    private ArrayList<Cykel> lagerListen = new ArrayList<>();

    public void tilføj(Cykel cykel) {
        lagerListen.add(cykel);
    }

    public int samletLagerBeholdning() {
        int sum = 0;
        for (Cykel cykel:lagerListen) {
            sum += cykel.getPris();
        }
        return sum;
    }

    public ArrayList<Cykel> getLagerListen() {
        return lagerListen;
    }
}
