public class Question{
    private int QuestionId;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;

    // constructor
    public Question(int QuestionId, String question, String option1, String option2, String option3, String option4, String answer) {
        this.QuestionId = QuestionId;
        this.answer = answer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.question = question;
    }
    // getting formatted object using to-string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("QuestionId=").append(QuestionId);
        sb.append(", question=").append(question);
        sb.append(", option1=").append(option1);
        sb.append(", option2=").append(option2);
        sb.append(", option3=").append(option3);
        sb.append(", option4=").append(option4);
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }
    

    // getters and setters
    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int QuestionId) {
        this.QuestionId = QuestionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    
}