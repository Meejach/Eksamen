import java.util.ArrayList;
import java.util.List;

public class Tal2 {
    int[] talListe = {5,66,12,87,66,56,89,66};

    public int tælTal(int helTal) {
        int forekomst = 0;
        for (int i = 0; i < talListe.length; i++) {
           if(talListe[i] == helTal) {
               forekomst++;
           }
        }
        return forekomst;
    }

    public int gennemsnit() {
        int gennemsnit = 0;
        for (int i = 0; i < talListe.length; i++) {
            gennemsnit += talListe[i];
        }
        return gennemsnit/talListe.length;
    }

}


