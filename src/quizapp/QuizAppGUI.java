/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author calde
 */
public class QuizAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form QuizAppGUI
     */
    public QuizAppGUI() {
        initComponents();
        EventListener listener = new EventListener();
        EventListener listenera = new EventListener();
        EventListener listenerb = new EventListener();
        createQuestionButton.addActionListener(listener);
        questionList.addActionListener(listenera);
        showAnswerButton.addActionListener(listenera);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerQuestionsTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        createQuestionButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        questionCreation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        answerCreation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        questionNameCreation = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionShowcase = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerShowcase = new javax.swing.JTextArea();
        questionList = new javax.swing.JComboBox<>();
        showAnswerButton = new javax.swing.JButton();
        showQuestion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        answerQuestionsTab.setPreferredSize(new java.awt.Dimension(800, 600));

        createQuestionButton.setText("Create Question");

        jLabel1.setText("Question");

        jLabel2.setText("Answer");

        answerCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerCreationActionPerformed(evt);
            }
        });

        jLabel4.setText("Question Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(createQuestionButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(questionCreation, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                        .addComponent(answerCreation)
                        .addComponent(jLabel2))
                    .addComponent(questionNameCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionNameCreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createQuestionButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        answerQuestionsTab.addTab("Create Questions", jPanel1);

        questionShowcase.setColumns(20);
        questionShowcase.setRows(5);
        jScrollPane2.setViewportView(questionShowcase);

        answerShowcase.setColumns(20);
        answerShowcase.setRows(5);
        jScrollPane1.setViewportView(answerShowcase);

        questionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Your Question" }));

        showAnswerButton.setText("Show Answer");

        showQuestion.setText("Show Question");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showAnswerButton)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(questionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showQuestion)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showQuestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(showAnswerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        answerQuestionsTab.addTab("Answer Questions", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(answerQuestionsTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(answerQuestionsTab, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerCreationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerCreationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizAppGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerCreation;
    private javax.swing.JTabbedPane answerQuestionsTab;
    private javax.swing.JTextArea answerShowcase;
    private javax.swing.JButton createQuestionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField questionCreation;
    private javax.swing.JComboBox<String> questionList;
    private javax.swing.JTextField questionNameCreation;
    private javax.swing.JTextArea questionShowcase;
    private javax.swing.JButton showAnswerButton;
    private javax.swing.JButton showQuestion;
    // End of variables declaration//GEN-END:variables
//My variables
  public  Boolean checkStringLength(String inputString, Integer minLength, Integer maxLength)
    {
        int stringLength = inputString.length();
        
        if (stringLength >= minLength && stringLength <= maxLength){
            System.out.println("pass");
            return true;           
        }
        else{
            System.out.println("fail");
            return false;
        } 
    }
    /**
     * inner event listener class - private.  This class handles GUI Events
     * ===Save Question Button===
     *  When the save question button is clicked:
     *  -the question string is passed to checkStringLength with a min length of 3 and a max length of 60.  If the string fails this test, an error box
     *      is shown and the question must be re-entered.
     *  -a new instance of Question is created within the instance of QuizApp
     *  -the instance of Question is added to the arrayList of Questions in QuizApp
     *  - the eventName is added to the select question combo boxes on the results tab and the add results tab.
     */
     private class EventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
           
        if(e.getSource() == createQuestionButton){
        System.out.println("createQuestionButton triggered");
        
        String testQuestion = questionCreation.getText();
        Boolean test = checkStringLength(testQuestion,3,60);
        if (test == false){
           System.out.println("false part");
           JOptionPane.showMessageDialog(new JFrame(),
           "Error - question needs to be between 3 and 60 characters in length",
           "Create Question Error",
           JOptionPane.ERROR_MESSAGE);
           questionCreation.setText("");}
        else {
        String questionName = questionNameCreation.getText();
        System.out.println(questionName);
        String question = questionCreation.getText();
        System.out.println(question);
        String answer = answerCreation.getText();
        System.out.println(answer);
        QuizApp.createNewQuestion(questionName, question, answer);//Create a new question in the QuizApp object.
        System.out.println("success");
        questionList.addItem(questionName);
        questionNameCreation.setText("");
        questionCreation.setText("");
        answerCreation.setText("");
        }
        }
        if(e.getSource() == showQuestion){
        System.out.println("Showing Question");
        String questionName = questionList.getSelectedItem().toString();
        FinalQuestions question = QuizApp.getQuestion(questionName);
        String questionFinal = FinalQuestions.getQuestion(questionName);
        String answer = FinalQuestions.getAnswer(questionName);
        questionShowcase.setText(questionFinal);
        answerShowcase.setText(answer);
        answerShowcase.setVisible(false);
        }
          if(e.getSource() == showAnswerButton){
        System.out.println("Showing Answer");
        answerShowcase.setVisible(true);
        }
        }
        }
}
