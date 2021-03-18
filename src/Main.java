import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the meaning of life?";
        String choiceOne = "1 - Get rich";
        String choiceTwo = "2 - Die trying to do number 1";
        String choiceThree = "3 - Spend time with family";

        String correctAnswer = choiceThree;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        System.out.println("What say you?");
        Scanner answer = new Scanner(System.in);
        // Retrieve the user's input
        int userChoice = answer.nextInt();
        // If the user's input matches the correctAnswer...
        if (userChoice == 3) {
            System.out.println("That's right! Money isn't everything.");
        } else {
            System.out.println("You have much to learn grasshopper.");
        }

    }

}
