public class Bil {

    private Trailer tailer;
    private int vægt;

    private boolean erTilkoblet;

    public Bil (int vægt) {
        this.vægt = vægt;
        this.erTilkoblet = false;
    }

    public int totalVægt() {
        if (erTilkoblet) {
       return vægt + tailer.getVægt();
    }
    else {
        return vægt;
        }
    }

    public void tilkoblTrailer(Trailer trailer) {
        erTilkoblet = true;
        this.tailer = trailer;
        if(totalVægt()> 3500) {
            erTilkoblet = false;
            this.tailer = null;
            System.out.println("Traileren kan ikke tilkobles da, totalvægten overskrider 3500 kg! ");
        }
        else {
            System.out.println("Traileren kan tilkobles til bilen! ");
        }
    }
}
