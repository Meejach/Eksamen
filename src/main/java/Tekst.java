import java.util.ArrayList;

public class Tekst {

    private ArrayList<String> tekstLinjer = new ArrayList<>();

    public void tilføj(String tekststreng){
        tekstLinjer.add(tekststreng);
    }

    public int findAntalUnikke() {

        int unikkeTekstLinjer = 0;

        for (String tekst:tekstLinjer) {
            int forkommer = 0;
            for (String indreTekst:tekstLinjer) {
                if (tekst.equals(indreTekst)) {
                    forkommer += 1;
                }

            }
            if (forkommer == 1) {
                unikkeTekstLinjer += 1;
            }
        }

        return unikkeTekstLinjer;
    }

    public ArrayList<String> getTekstLinjer() {
        return tekstLinjer;
    }
}

