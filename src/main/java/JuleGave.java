import java.util.Random;

public class JuleGave {

    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public JuleGave () {
        Random random = new Random();
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
    }

    public boolean couldBeLego () {
        if (isSoft == false && isRectangular == true && doesRattle == true) {
            return true;
        }
        return false;

    }
}
