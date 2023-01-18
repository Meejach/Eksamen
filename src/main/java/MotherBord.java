import java.util.ArrayList;

public class MotherBord {

   private ArrayList <SataDrive> sataDrives = new ArrayList<>();

    public void udskrivDrives() {
        System.out.println(sataDrives);
    }

    public boolean tilføjDrive () {
        if (sataDrives.size() == 4) {
            System.out.println("MotherBoard er dsv fyldt du kan ikke tilkoble noget! ");
            return false;
        }
        else {
            sataDrives.add(new SataDrive());
            return true;
        }
    }
}
