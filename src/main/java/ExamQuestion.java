import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {

    private int number;
    private String grade;

    public ExamQuestion ( Integer number) {
        randomGrade();
        this.number = number;
    }

    public void createExamQuestions() {
        ArrayList<ExamQuestion> examQuestions = new ArrayList<>();
        for (int spørgsmål = 1; spørgsmål < 15; spørgsmål++) {
            examQuestions.add(new ExamQuestion(spørgsmål));
        }
        System.out.println(examQuestions);
    }

    public void randomGrade() {
        Random random = new Random();
        int randomNumber = random.nextInt(6);
        if (randomNumber == 0) {
            this.grade = "A";
        } else if (randomNumber == 1) {
            this.grade = "B";
        } else if (randomNumber == 2) {
            this.grade = "C";
        } else if (randomNumber == 3) {
            this.grade = "D";
        } else if (randomNumber == 4) {
            this.grade = "E";
        } else if (randomNumber == 5) {
            this.grade = "F";
        }
    }
}
