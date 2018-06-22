package quizapp;
import java.util.ArrayList;
/**
 * @calde
 * @version (1)
 * Creates GUI, holds arrayList of Questions,
 */

public class QuizApp
{
    // instance variables
    public static ArrayList<FinalQuestions> quizAppQuestions = new ArrayList<FinalQuestions>();

    /**
     * Constructor for objects of class SportsDay
     */
    public QuizApp()
    {
     
    } 
    /**
     * Adds a question into the arraylist of questions.
     * @param questionName
     * @param question
     * @param answer
     */
    public static void createNewQuestion(String questionName, String question, String answer)
    {
        FinalQuestions Question = new FinalQuestions(questionName, question, answer);
        quizAppQuestions.add(Question);
    }
    /**
     * Returns a question from the arraylist of questions, given the questionName.
     * @param name
     * @return 
     */
    public static FinalQuestions getQuestion(String name)
    {
        FinalQuestions question = null;
        for (FinalQuestions ev : quizAppQuestions){
            if (ev.getQuestionName().equals(name)){
                System.out.println("found object:" +ev.getQuestionName());
                question = ev;
            }
        }
        return question;   
    }

            // Main method to get things started
      	public static void main( String args[] )
	{
		// Create an instance of the gui application
		
		QuizAppGUI mainFrame	= new QuizAppGUI();// new gui instance
		mainFrame.setVisible( true );
	}
}