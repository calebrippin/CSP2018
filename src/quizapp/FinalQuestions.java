package quizapp;
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
     * @param questionName
     * @param question
     * @param answer
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
     * @return 
     * @RETURN String questionName
     * 
     */
     public String getQuestionName()
     {
         return questionName;
         
     }  
         /**
     * getQuestion
     * @param questionName
     * @return 
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
