import java.util.Locale;
import java.util.Scanner;

public class MultipleChoice {

    public static void main(String args[]) {
        String question = "Who is the current italian president?";
        String choiceOne = "salvini";
        String choiceTwo = "mattarella";
        String choiceThree = "giggino\n";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne +", " + choiceTwo + " or " + choiceThree);

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        if(correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Congrats!");
        } else {
            System.out.println("Nope. The proper answer is " + correctAnswer );
        }
    }
}
