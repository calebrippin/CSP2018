package quizapp;
/**
 * @author calde
 * @version 
 */
public class FinalQuestions
{
    // instance variables 
    private static String questionName;
    private static String question;
    private static String answer;
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
        FinalQuestions.questionName = questionName;
        FinalQuestions.question = question;
        FinalQuestions.answer = answer;
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
     public static String getQuestion(String questionName)
     {
         return question;
         
     }
          public static String getAnswer(String questionName)
     {
         return answer;
         
     }
 
    }
