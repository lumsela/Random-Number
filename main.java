	 import javax.swing.*;
	 import java.awt.event.*;
	 import java.awt.*;
public class main  extends JFrame {

	 private JPanel panel; 
	 private JLabel messageLabel; 
	 private JTextField input1TextField; 
	 private JTextField input2TextField; 
	 private JButton randomButton; 
	 private JTextField answerTextField ; 
	
	 private final int WINDOW_WIDTH = 657; // Window width
	 private final int WINDOW_HEIGHT = 660; // Window height
	
	 public main()
	 {
	
	 setTitle("Word Reverse");
	 setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 Font font1 = new Font("Arial", Font.BOLD, 50);
	 
	 messageLabel = new JLabel("Random Number");
	 input1TextField = new JTextField(10);
	 input2TextField = new JTextField(10);
	 randomButton = new JButton("Random");
	 answerTextField = new JTextField(10);
	 randomButton.addActionListener(new ButtonListener());	 
	 
	 messageLabel.setFont(font1);
	 input1TextField.setFont(font1);
	 input2TextField.setFont(font1);
	 randomButton.setFont(font1);
	 answerTextField.setFont(font1);
	 
	 
	 
	 panel = new JPanel();
	 panel.add(messageLabel);
	 panel.add(input1TextField);
	 
	 panel.add(input2TextField);
	 panel.add(randomButton);
	 panel.add(answerTextField);
	 panel.setBackground(Color.orange);

	 add(panel);
	 setVisible(true);
	 }
	 
	 private class ButtonListener implements ActionListener
	 {
	 public void actionPerformed(ActionEvent e)
	 {
	 int input1 =0; 
	 int input2=0; 
	 boolean hmm = false;

	 try {
		 input1 = Integer.parseInt(input1TextField.getText());
		 input2 = Integer.parseInt(input2TextField.getText());
		}
		catch(Exception e1) {
			hmm = true;
		}
		
		 
if (hmm){
	answerTextField.setText( "Use Numbers");
}else if (input1 > input2){
	answerTextField.setText( "Lower then Upper");
	
}else {
		 
		 int result = (int)(Math.random()*(input2+1-input1))+input1;
	 answerTextField.setText( Integer.toString(result));
}
	
	 }
	 }
	 
	
	 public static void main(String[] args)
	 {
	 new main();
	 }
	 }
	

