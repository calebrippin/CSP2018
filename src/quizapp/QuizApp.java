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
    private ArrayList<FinalQuestions> quizAppQuestions = new ArrayList<FinalQuestions>();

    /**
     * Constructor for objects of class SportsDay
     */
    public QuizApp()
    {
     
    }    
    /**
     * Returns a question from the arraylist of questions.
     */
    public void createNewQuestion(String questionName, String question, String answer)
    {
        FinalQuestions Question = new FinalQuestions(questionName, question, answer);
        quizAppQuestions.add(Question);
    }
    /**
     * Returns an event from the arraylist of events, given the eventName.
     */
    public FinalQuestions getQuestion(String name)
    {
        FinalQuestions question = null;
        for (FinalQuestions ev : quizAppQuestions){
            if (ev.getQuestionName().equals(name)){
                System.out.println("found object:" +ev.getQuestionName().toString() );
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