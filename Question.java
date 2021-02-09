public class Question {

    //private attributes for question, answer, and difficulty
    private String question;
    private String answer;
    private int diff;

    //constructor with 3 arguments
    public Question(String question, String answer, int diff) {
        this.question = question;
        this.answer = answer;
        this.diff = diff;
    }


    //getters and setters for 3 attributes
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }
}
