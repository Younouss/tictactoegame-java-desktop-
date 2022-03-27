import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class TicTacToe extends JFrame{
    public TicTacToe (){ 
        setTitle("p2Younouss_T");
        setSize(500, 500);
        textFieldNorth = new JTextField();
        textFieldNorth.setFont(new Font("Courier New", Font.BOLD, 18));
        Container contentPane = getContentPane();
        contentPane.add(textFieldNorth, "North");
        textFieldNorth.setText("Play Tic-TacToe: O' s turn!");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        contentPane.add(panel, "Center");
        button11 = new JButton(" ");
        button11.setFont(new Font("Courier New", Font.BOLD, 56));
        button12 = new JButton(" ");
        button12.setFont(new Font("Courier New", Font.BOLD, 56));        
        button13 = new JButton(" ");
        button13.setFont(new Font("Courier New", Font.BOLD, 56));
        button21 = new JButton(" ");
        button21.setFont(new Font("Courier New", Font.BOLD, 56));
        button22 = new JButton(" ");
        button22.setFont(new Font("Courier New", Font.BOLD, 56));
        button23 = new JButton(" ");
        button23.setFont(new Font("Courier New", Font.BOLD, 56));
        button31 = new JButton(" ");
        button31.setFont(new Font("Courier New", Font.BOLD, 56));
        button32 = new JButton(" ");
        button32.setFont(new Font("Courier New", Font.BOLD, 56));
        button33 = new JButton(" ");
        button33.setFont(new Font("Courier New", Font.BOLD, 56));
        ButtonObserver observer = new ButtonObserver();
        button11.addActionListener(observer);
        button12.addActionListener(observer);
        button13.addActionListener(observer);
        button21.addActionListener(observer);
        button22.addActionListener(observer);
        button23.addActionListener(observer);
        button31.addActionListener(observer);
        button32.addActionListener(observer);
        button33.addActionListener(observer);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button21);
        panel.add(button22);
        panel.add(button23);
        panel.add(button31);
        panel.add(button32);
        panel.add(button33);       
   }
    class ButtonObserver implements ActionListener {
        String message = "O's Turn!";
        Boolean checkIfWinner = false;
        @Override        
        public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();             
            if(message == "O's Turn!"){ 
                if(source == button11){
                    button11.setText("O");
                    button11.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }
                if(source == button12){
                    button12.setText("O");
                    button12.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }           
                if(source == button13){
                    button13.setText("O");
                    button13.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }           
                if(source == button21){
                    button21.setText("O");
                    button21.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }          
                if(source == button22){
                    button22.setText("O");
                    button22.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }           
                 if(source == button23){
                    button23.setText("O");
                    button23.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }           
                if(source == button31){
                    button31.setText("O");
                    button31.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }          
                if(source == button32){
                    button32.setText("O");
                    button32.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }           
                if(source == button33){
                    button33.setText("O");
                    button33.setEnabled(false);
                    message = "X's Turn!";
                    textFieldNorth.setText(message);
                }                
            }
            else if(message == "X's Turn!"){
                if(source == button11){
                    button11.setText("X");
                    button11.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }   
                if(source == button12){
                    button12.setText("X");
                    button12.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }
                if(source == button13){
                    button13.setText("X");
                    button13.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }   
                if(source == button21){                 
                    button21.setText("X");
                    button21.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }           
                 if(source == button22){                     
                    button22.setText("X");
                    button22.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }   
                if(source == button23){                  
                    button23.setText("X");
                    button23.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }           
                  if(source == button31){                     
                    button31.setText("X");
                    button31.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }   
                if(source == button32){                  
                    button32.setText("X");
                    button32.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }          
                 if(source == button33){                     
                    button33.setText("X");
                    button33.setEnabled(false);
                    message = "O's Turn!";
                    textFieldNorth.setText(message);
                }                 
             }
             
             if((button11.getText().equals("O") && button12.getText().equals("O") && button13.getText() == "O") || (button21.getText().equals("O") && button22.getText().equals("O") && button23.getText().equals("O")) || (button31.getText().equals("O")&& button32.getText().equals("O") && button33.getText().equals("O")) || (button11.getText().equals("O") && button21.getText().equals("O") && button31.getText().equals("O")) || (button12.getText().equals("O") && button22.getText().equals("O") && button32.getText().equals("O")) || (button13.getText().equals("O") && button23.getText().equals("O") && button33.getText().equals("O")) || (button11.getText().equals("O")&& button22.getText().equals("O") && button33.getText().equals("O")) || (button13.getText().equals("O") && button22.getText().equals("O") && button31.getText().equals("O"))){ 
                textFieldNorth.setText("Game Over: Winner is O"); 
                button11.setEnabled(false);
                button21.setEnabled(false);
                button31.setEnabled(false);
                button12.setEnabled(false);
                button22.setEnabled(false);
                button32.setEnabled(false);     
                button13.setEnabled(false);
                button23.setEnabled(false);
                button33.setEnabled(false);
                checkIfWinner = true;
             }  
              if((button11.getText().equals("X") && button12.getText().equals("X") && button13.getText() == "X") || (button21.getText().equals("X") && button22.getText().equals("X") && button23.getText().equals("X")) || (button31.getText().equals("X")&& button32.getText().equals("X") && button33.getText().equals("X")) || (button11.getText().equals("X") && button21.getText().equals("X") && button31.getText().equals("X")) || (button12.getText().equals("X") && button22.getText().equals("X") && button32.getText().equals("X")) || (button13.getText().equals("X") && button23.getText().equals("X") && button33.getText().equals("X")) || (button11.getText().equals("X")&& button22.getText().equals("X") && button33.getText().equals("X")) || (button13.getText().equals("X") && button22.getText().equals("X") && button31.getText().equals("X"))){ 
                textFieldNorth.setText("Game Over: Winner is X"); 
                button11.setEnabled(false);
                button21.setEnabled(false);
                button31.setEnabled(false);
                button12.setEnabled(false);
                button22.setEnabled(false);
                button32.setEnabled(false);     
                button13.setEnabled(false);
                button23.setEnabled(false);
                button33.setEnabled(false);
                checkIfWinner = true;
             }  
             if(checkIfWinner == false && button11.isEnabled() == false && button12.isEnabled() == false && button13.isEnabled() == false && button21.isEnabled() == false && button22.isEnabled() == false && button23.isEnabled() == false && button31.isEnabled() == false && button32.isEnabled() == false && button33.isEnabled() == false){
                textFieldNorth.setText("Game Over: TIE"); 
             }
        } 
    }    
   private final JTextField textFieldNorth;
   private final JButton  button11, button12, button13, button21, button22, button23, button31, button32, button33;
   
}
