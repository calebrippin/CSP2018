package quizapp;

import java.util.ArrayList;

/**
 * @author calde
 * @version 1
 * Holds the questionList information and a private inner class of the questions and their answers.  The data for each question is held as an array of
 * questions (question object).  Each question has its data held within the question instance.  This means that the data for the question is encapsulated within the 
 * question object.  This is much more secure than a general array of results.
 */
public class FinalQuestions
{
    // instance variables 
    private String questionName;
    private String question;
    private String answer;
    private ArrayList<Question> questions = new ArrayList<Question>();


     /**
      * Add competitor to the ArrayList of competitors
      */
     public void addQuestion(String questionName, String question, String answer){
        questions.add(new Question (questionName, question, answer));
         System.out.println("Added Question");
        }
     
     /** inner class Person */
    private class Question{
        
        private String questionName;
        private String question;
        private String answer;
        
        public Question(String questionName, String question, String answer){
        
            this.questionName = questionName;
            this.question = question;
            this.answer = answer;
              
        }
        
        public String getQuestionName(){
           String name = questionName;
           return name;
        }
        
        public String getQuestion(){
        return question;
        }
                
        public String getAnswer(){
            return answer;
        }
            
        }
        
    }