import java.util.Random;

public class JuleGave2 {

    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;


    public JuleGave2 () {
        Random random = new Random();
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
    }

    public static void main(String[] args) {
        JuleGave2 juleGave2 = new JuleGave2();
        System.out.println(juleGave2.couldBeLego());
    }

    public boolean couldBeLego() {
        if (isSoft == false && isRectangular == true && doesRattle == true) {
            return true;
        }
        return false;
    }
}
