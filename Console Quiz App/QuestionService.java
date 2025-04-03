import java.util.Scanner;

public class QuestionService {

    Questions[] questions=new Questions[5];
    Answer[]answers=new Answer[5];
    private int score;

    public void questions() {
        questions[0]=new Questions(1,"What is the capital of India?","Mumbai","Delhi","Kolkata","Chennai","Delhi");
        questions[1]=new Questions(2,"What is the capital of Australia?","Sydney","Melbourne","Canberra","Perth","Canberra");
        questions[2]=new Questions(3,"What is the capital of USA?","New York","Washington D.C.","Los Angeles","Chicago","Washington D.C.");
        questions[3]=new Questions(4,"What is the capital of UK?","Manchester","Birmingham","London","Liverpool","London");
        questions[4]=new Questions(5,"What is the capital of Japan?","Tokyo","Kyoto","Osaka","Hiroshima","Tokyo");
    }

    public void playGame(){
        Scanner sc=new Scanner(System.in);
         int i=0;
        for(Questions question:questions){
            System.out.println(question.getId()+". "+question.getQuestion());
            System.out.println(question.getOption1()+"  2."+question.getOption2()+"  3."+question.getOption3()+"  4."+question.getOption4());
            answers[i]=new Answer(sc.nextLine());
            i++;
        }
        int finalScore=scores(questions,answers);
        System.out.println("final score "+score);
        }

    public int scores(Questions questions[],Answer[] answers){
          for(int i=0;i<questions.length;i++){
               if(questions[i].getAnswer().equalsIgnoreCase(answers[i].getAnswer())){
                   score++;
               }
          }
        
        return score;

    }
    

    
    
}
