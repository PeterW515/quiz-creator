import java.util.*;

public class Quiz {

    //ArrayList of questions
    private List<Question> quizQuestions = new ArrayList<>();

    //scanner object for input
    Scanner scan = new Scanner(System.in);

    //method to allow user to add question
    public void add_question() {

        //prompts for question/answer/difficulty and scanner for input
        System.out.println("What is the question text?");
        String qText = scan.nextLine();
        System.out.println("What is the answer?");
        String aText = scan.nextLine();
        System.out.println("How difficult (1-3)?");
        int diff = Integer.parseInt(scan.nextLine());

        //create question object and add to the ArrayList
        Question newQ = new Question(qText, aText, diff);
        quizQuestions.add(newQ);


    }

    //method to allow user to remove a question
    public void remove_question() {

        //Prompt for question to remove
        System.out.println("Choose the question to remove:");
        //variable representing question index
        int qCount = 0;
        //loop to display each question
        for (Question q : quizQuestions) {
            System.out.println(qCount + ". " + q.getQuestion());
            qCount++;
        }
        //receive user input for question to be removed
        int remove = Integer.parseInt(scan.nextLine());
        //remove question
        quizQuestions.remove(remove);
    }

    //method to allow user to modify question
    public void modify_question() {

        //prompt for question to modify
        System.out.println("Choose the question to modify:");
        //variable representing question index
        int qCount = 0;
        //loop to display each question
        for (Question q : quizQuestions) {
            System.out.println(qCount + ". " + q.getQuestion());
            qCount++;
        }
        //receive user input for question to be modified
        int mod = Integer.parseInt(scan.nextLine());

        //prompts for modified question attributes and calls to set new attributes
        System.out.println("What is the question text?");
        quizQuestions.get(mod).setQuestion(scan.nextLine());
        System.out.println("What is the answer?");
        quizQuestions.get(mod).setAnswer(scan.nextLine());
        System.out.println("How difficult (1-3)?");
        quizQuestions.get(mod).setDiff(Integer.parseInt(scan.nextLine()));
    }

    //method to give the quiz
    public void give_quiz() {
        //variable to store the user's quiz score
        int score = 0;

        //loop to cycle through each question
        for (Question q : quizQuestions) {
            //display question
            System.out.println(q.getQuestion());
            //variable to store answer
            String ans = scan.nextLine();
            //if else to check if answer is correct
            if (ans.equals(q.getAnswer())) {
                System.out.println("Correct");
                score++;
            } else System.out.println("Incorrect");

        }
        //print user score
        System.out.println("You got " + score + " out of " + quizQuestions.size());
    }
}
