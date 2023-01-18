import java.util.ArrayList;
import java.util.Arrays;

public class Keyword {

    public String word;
    public String definition;
    public ArrayList<Keyword> seeAlso = new ArrayList<>();

    public Keyword (String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    public void seeAlsoUdfyld() {
        seeAlso.add(new Keyword("Vandmelon", "Sommer frugt"));
        seeAlso.add(new Keyword("Naruto", "Anime serie"));
        seeAlso.add(new Keyword("Razer", "Gaming udstyr"));
    }


    public boolean matches(String søgeord) {
        if (word.toLowerCase().contains(søgeord.toLowerCase())) {
            return true;
        }
        return false;
    }

    public void udskrift() {
        System.out.println(word);
        System.out.println(definition);

        for (int i = 0; i < seeAlso.size(); i++) {

                System.out.println(seeAlso.get(i).word);
        }

    }

}
