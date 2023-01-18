import java.io.PrintWriter;

public class Article {

    private String heading = "League Of Legends";
    private static String body = "Welcome to the stream! I'm Mads, also known as Broxah, a 25-year-old gamer from Denmark. I'm a professional League of Legends player, always aiming to bring you positive vibes and great experiences here on the stream! -- Business inquiries: broxah@forevr.gg";
    private String author = "Broxah";

    public static void main(String[] args) {
        System.out.println(getLongestWord());
    }

    public static String getLongestWord () {
        String[] splitNames = body.replaceAll("!","").replaceAll("@"," ").replaceAll("-", " ").replaceAll("\\.", " ")
                .split(" ");

        String longestWord = "l";
        for (int i = 0; i <splitNames.length ; i++) {
            if(splitNames[i].length()> longestWord.length()){
                longestWord = splitNames[i];
            }
        }
        return longestWord;
    }
}
