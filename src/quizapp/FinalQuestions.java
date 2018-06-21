package quizapp;

import java.util.ArrayList;

/**
 * @author calde
 * @version 
 */
public class FinalQuestions
{
    // instance variables 
    private String questionName;
    private String question;
    private String answer;
    /**
     * Constructor for objects of class FinalQuestions
     * @PARAM String questionName - the name of the question
     * @PARAM String question -  the question
     * @PARAM String answer - the answer
     */
    public FinalQuestions(String questionName, String question, String answer)
    {
        // initialise instance variables
        this.questionName = questionName;
        this.question = question;
        this.answer = answer;
    }
    /**
     * getQuestionName
     * @RETURN String questionName
     * 
     */
     public String getQuestionName()
     {
         return questionName;
         
     }  
         /**
     * getQuestion
     * @RETURN String eventName
     * 
     * Return the instances eventName
     * 
     */
     public String getQuestion(String questionName)
     {
         return question;
         
     }
          public String getAnswer(String questionName)
     {
         return answer;
         
     }
 
    }
