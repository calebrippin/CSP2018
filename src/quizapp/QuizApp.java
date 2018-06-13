/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

/**
 *
 * @author calde
 */
public class QuizApp {

    /**
     * @param args the command line arguments
     */
public static void main( String args[] )
	{
		// Create an instance of the gui application
		    
    javax.swing.JFrame window = new javax.swing.JFrame("QuizApp");
    window.getContentPane().add(new QuizAppGUI());
    window.setVisible(true);  
    window.pack(); 
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	}

    static void createNewQuestion(String question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void createNewAnswer(String answer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
