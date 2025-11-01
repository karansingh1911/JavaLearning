
import java.util.Scanner;

class QuestionService{
    Scanner sc= new Scanner(System.in);
    
    Question[] questions= new Question[4];
    
    public QuestionService(){ // questionService will be responsible for creating hardcoded questions.
        questions[0]= new Question(1, "What is my name?","Karan","Ram","Shyam","Rohan", "Karan");
        questions[1]= new Question(2, "What is the language i'm learning now?","Cpp","Python","Java","Random", "Java");
        questions[2]= new Question(3, "What the size of int in java?","1","2","4","8", "4");
        questions[3]= new Question(4, "What is the default value of an uninitialized boolean variable in Java?","true","false","null","zero", "false");
    }
    public void displayQuestions(){
        for (Question q : questions){
            System.out.println(q);
        }
    }
    public void playQuiz(){
        int score=0;
        System.out.println("Let's Start the Quiz! 📌");
        for (Question question : questions){
            System.out.println(question.getQuestion()); // show question 
            System.out.println(question.getOption1()+ " "+  question.getOption2()+" "+question.getOption3()+ " "+question.getOption4()); // show options
            System.out.print("Enter your answer:"); // show message to get the answer
            String givenAnswer= sc.next();
            if (givenAnswer.equals(question.getAnswer())){
                 score++;
                //  System.out.println(score);f
                }
            else{
            System.out.println(givenAnswer);
        }
        
        }
        System.out.println("You achieved "+score+"/4 "+"marks.🗞️");
        sc.close();
    }
    
}