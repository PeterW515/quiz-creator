import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //create quiz object
        Quiz quiz = new Quiz();
        //declare variable for user's menu choice
        int choice;
        //create scanner object
        Scanner scan = new Scanner(System.in);
        //do while to ensure loop runs at least once
        do {
            //display menu
            System.out.println("What would you like to do?");
            System.out.println("1. Add a question to the quiz");
            System.out.println("2. Remove a question from the quiz");
            System.out.println("3. Modify a question in the quiz");
            System.out.println("4. Take the quiz");
            System.out.println("5. Quit");

            //read user choice
            choice = Integer.parseInt(scan.nextLine());
            //check user choice, call appropriate Quiz method
            switch (choice) {
                case 1:
                    quiz.add_question();
                    break;
                case 2:
                    quiz.remove_question();
                    break;
                case 3:
                    quiz.modify_question();
                    ;
                    break;
                case 4:
                    quiz.give_quiz();
                    break;
            }
            //exit if user chooses to quit
        } while (choice != 5);
    }
}
