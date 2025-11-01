public class Main{
    public static void main(String[]  args){
        // service initialized the quiz contents and also offers the playQuiz method!
        QuestionService service = new QuestionService();
        // service.displayQuestions(); 
        service.playQuiz();
    }
} 