public class Candidate {

    public static void main(String[] args) {

    }

    private String name;
    private String party;
    private Integer numberOfVotes;

    public Candidate(String name, String party, Integer numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNunmerOfVotes() {
        return numberOfVotes;
    }

    public String getParty() {
        return party;
    }

}
