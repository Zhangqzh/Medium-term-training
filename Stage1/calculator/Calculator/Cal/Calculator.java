import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame implements ActionListener {
	private double leftOperand;
	private double rightOperand;
	private double result;
	private int mode = -1;
	private JLabel operatorLabel = new JLabel(" ");
	private JLabel equalLabel = new JLabel("=");
	private JLabel resultLabel = new JLabel(" ");
	private JTextField leftField = new JTextField(10);
	private JTextField rightField = new JTextField(10);

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		
	}

	public Calculator(){ 
	
		resultLabel.setBorder(BorderFactory.createLineBorder(Color.black));


		
		this.add(leftField);
		this.add(operatorLabel);
		this.add(rightField);
		this.add(equalLabel);
		this.add(resultLabel);

		String[] ops = {"+","-","*","/","OK"};
		for(String str: ops){
			JButton btn = new JButton(str);
			btn.addActionListener(this);
			this.add(btn);
		}

		this.setLayout(new GridLayout(2,5));
		this.setTitle("myCalculator");
		this.setSize(500,200);
		this.setLocation(500,350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("+")){
			operatorLabel.setText("+");
			mode = 0;
		}
		else if(e.getActionCommand().equals("-")){
			operatorLabel.setText("-");
			mode = 1;
		}
		else if(e.getActionCommand().equals("*")){
			operatorLabel.setText("*");
			mode = 2;
		}
		else if(e.getActionCommand().equals("/")){
			operatorLabel.setText("/");
			mode = 3;
		}
		else {
			try {
				leftOperand = Double.parseDouble(leftField.getText());
				rightOperand = Double.parseDouble(rightField.getText());
				String s = "";
				if (mode == 0) {
					result = leftOperand + rightOperand;
					s = "" + result;
				}
				else if (mode == 1) {
					result = leftOperand - rightOperand;
					s = "" + result;
				} 
				else if (mode == 2) {
					result = leftOperand * rightOperand;
					s = "" + result;
				}
				else if (mode == 3){
					result = leftOperand / rightOperand;
					if (rightOperand == 0)
						JOptionPane.showMessageDialog(null,"The divisor can't be zero!", "WARNING", JOptionPane.WARNING_MESSAGE);
					else
						s = "" + result;
				}
				else {
					JOptionPane.showMessageDialog(null,"There must be a operator", "WARNING", JOptionPane.WARNING_MESSAGE);
				}
				resultLabel.setText(s);
			} catch (Exception er) {
				JOptionPane.showMessageDialog(null,"Input Invalid!", "WARNING", JOptionPane.WARNING_MESSAGE);
			}
			
		}
	}
}