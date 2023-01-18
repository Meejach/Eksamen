import java.util.ArrayList;

public class Election {

    static ArrayList<Candidate> candidate = new ArrayList<>();
     public static int getTotalVoest() {
         int totaltVotes = 0;
         for (int omgang = 0; omgang < candidate.size(); omgang++) {
             totaltVotes += candidate.get(omgang).getNunmerOfVotes();
         }
         return totaltVotes;
     }

    public static void main(String[] args) {
        candidate.add(new Candidate("l","d",13));
        candidate.add(new Candidate("ole","Venstre", 2));
        candidate.add(new Candidate("Karl","sf", 5));

        System.out.println(getTotalVoest());
        System.out.println(getCandidatesFromParty("Venstre").size());
    }

    public static ArrayList<Candidate> getCandidatesFromParty (String party) {
         ArrayList<Candidate> candidates = new ArrayList<>();
        for (int omgang = 0; omgang < candidate.size(); omgang++) {
            if (party.equals(candidate.get(omgang).getParty())) {
                candidates.add(candidate.get(omgang));
            }
        }
        return candidates;
    }
 }
