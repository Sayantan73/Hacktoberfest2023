package color_game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class colorGame {

  private JFrame frame;
  int score=0,lives=0,n=0,n1=0,temp=0;
  Color[] c= {Color.white,Color.blue,Color.green,Color.orange,Color.yellow,Color.black,Color.pink,Color.red};
  String[] cs= {"WHiTe","BlUe","GrEeN","orange","Yellow","Black","pink","Red"};
  private JTextField textField;
  String tempstr="";
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          colorGame window = new colorGame();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public colorGame() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblWelcomeToColor = new JLabel("Welcome to Color Game");
    lblWelcomeToColor.setFont(new Font("Dialog", Font.BOLD, 20));
    lblWelcomeToColor.setBounds(72, 12, 321, 50);
    frame.getContentPane().add(lblWelcomeToColor);
    
    JLabel lblScore = new JLabel("Score:");
    lblScore.setBounds(24, 47, 70, 15);
    frame.getContentPane().add(lblScore);
    
    JLabel label = new JLabel("0");
    label.setBounds(72, 47, 70, 15);
    frame.getContentPane().add(label);
    
    JLabel lblLives = new JLabel("Lives:");
    lblLives.setBounds(323, 40, 50, 41);
    frame.getContentPane().add(lblLives);
    
    JLabel label_1 = new JLabel("0");
    label_1.setBounds(371, 46, 50, 29);
    frame.getContentPane().add(label_1);
    
    JLabel lblColor = new JLabel("Color");
    lblColor.setHorizontalAlignment(SwingConstants.CENTER);
    lblColor.setFont(new Font("Dialog", Font.BOLD, 30));
    lblColor.setBounds(91, 74, 264, 92);
    frame.getContentPane().add(lblColor);
    
    textField = new JTextField();
    textField.setBounds(101, 202, 216, 19);
    frame.getContentPane().add(textField);
    textField.setColumns(10);
    
    JButton btnSubmit = new JButton("Submit");
    btnSubmit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        Random random=new Random();
        String t=textField.getText().toLowerCase();
        //System.out.println(t);
        int tempn=n;
        //System.out.println(cs[tempn].toLowerCase());
        if(temp>12 || lives==0 || tempstr.isEmpty()) {
          if(tempstr.isEmpty()&&!t.equals("start")){
            JOptionPane.showMessageDialog(frame,"Please Start the game by typing start","Alert",JOptionPane.WARNING_MESSAGE);}  
          
          if(!tempstr.isEmpty()){
            
          String status="";
          if(score>9) {
            status="Winner";
          }
          else {
            status="losser";
          }
            JOptionPane.showMessageDialog(frame,"Game Over!\n"+status+" Your Score"+String.valueOf(score)+"\n Restart Your game by typing Start in Text Field","Alert",JOptionPane.WARNING_MESSAGE);}     
        }
        if(t.equals("start")) {
          score=0;temp=0;
          lives=3;
          tempstr="start";
          label.setText(String.valueOf(score));
          label_1.setText(String.valueOf(lives));
          n=random.nextInt(c.length-1);
          n1=random.nextInt(cs.length-1);
          lblColor.setText(cs[n1]);
          lblColor.setForeground(c[n]);
        }
        else if(tempstr.equals("start")&&lives!=0) {
          if(t.equals(cs[tempn].toLowerCase())) {
            score++;
            temp++;
            label.setText(String.valueOf(score));
            n=random.nextInt(c.length-1);
            n1=random.nextInt(cs.length-1);
            lblColor.setText(cs[n1]);
            lblColor.setForeground(c[n]);
          }
          else {
            lives--;
            temp++;
            label_1.setText(String.valueOf(lives));
            n=random.nextInt(c.length-1);
            n1=random.nextInt(cs.length-1);
            lblColor.setText(cs[n1]);
            lblColor.setForeground(c[n]);
          
        }}
      }
    });
    btnSubmit.setBounds(164, 233, 117, 25);
    frame.getContentPane().add(btnSubmit);
    
    JLabel lblToStartOr = new JLabel("To start or restart the game enter start and submit it ");
    lblToStartOr.setBounds(24, 74, 414, 15);
    frame.getContentPane().add(lblToStartOr);
    
    JLabel lblEnterTheCorrect = new JLabel("Enter the correct color of the text");
    lblEnterTheCorrect.setHorizontalAlignment(SwingConstants.CENTER);
    lblEnterTheCorrect.setBounds(35, 178, 349, 15);
    frame.getContentPane().add(lblEnterTheCorrect);
  }
}
