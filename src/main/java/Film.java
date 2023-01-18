public class Film {

    private String filmtitel;
    private int udgivelseår;

    private Producer producer;

    public Film(String filmtitel, int udgivelseår) {
        this.filmtitel = filmtitel;
        this.udgivelseår = udgivelseår;
    }

    public Film(String filmtitel) {
        this.filmtitel = filmtitel;
        this.udgivelseår = 2022;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public String getFilmtitel() {
        return filmtitel;
    }

    public int getUdgivelseår() {
        return udgivelseår;
    }
}
