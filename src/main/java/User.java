import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class User {

    private String fullName;
    private String userID;

    private String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "æ", "ø", "å"};

    public User(String fullName) {
        this.fullName = fullName;
    }

    public boolean validUserID() {
        try {
            for (int omgang = 0; omgang < 8; omgang++) {
                if (omgang < 4) {
                    ArrayList l = new ArrayList<>(List.of(alphabet));
                    if (!l.contains(String.valueOf(userID.charAt(omgang)))) { // Vi tager 'd' bruger String.ValueOf() til at transformere 'd' til en string værdi altså "d"
                        System.out.println("De 4 første bogstaver overholder ikke kravene!");
                        return false;
                    }

                }
            }

        } catch (Exception e) {

        }
        return true;
    }

    public String createUserID() {
        String[] splitNames = fullName.split(" ");
        String firstName = splitNames[0];
        String lastName = splitNames[1];
        Random random = new Random();

        userID = firstName.substring(0, 2).toLowerCase() + lastName.substring(0, 2).toLowerCase();
        for (int runde = 0; runde < 4; runde++) {
            int randomNumber = random.nextInt(9);
            userID = userID.concat(Integer.toString(randomNumber));
        }
        return userID;
    }

}
