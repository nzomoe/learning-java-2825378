
public class Main {

    public static void main(String args[]) {
        String question = "What is my name?";
        String choiceOne = "Eric";
        String choiceTwo = "Mercy";
        String choiceThree = "John";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println (Question);
        // Write a print statement giving the answer choices
        System.out.println ("Choose one of the following: ChoiceOne + "," + choiceTwo + "," + choiceThree");
            
        // Have the user input an answer
        Scanner Scanner = new Scanner (System.in);
        // Retrieve the user's input
        String input = new Scanner(System.in);

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(correctAnswer.equals(input)) {
            System.out.println ("Congrats");
            else {
                System.out.println ("Wrong! + " " correctAnswer")
            }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
