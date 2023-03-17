package calculator_new;

import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.type.NullType;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame implements ActionListener {
	JFrame jf;
	JLabel DisplayLabel;
	JButton Seven_Button;
	JButton Eight_Button;
	JButton Nine_Button;
	JButton Sum_Button;
	JButton Four_Button;
	JButton Five_Button;
	JButton Six_Button;
	JButton Sub_Button;
	JButton One_Button;
	JButton Two_Button;
	JButton Three_Button;
	JButton Div_Button;
	JButton Clear_Button;
	JButton Dote_Button;
	JButton Equel_Button;
	JButton Zero_Button;
	JButton Multiplication_Button;
	JButton Delete_Button;
	JButton Persentage_Button;
	JButton Squareroot_Button;

	float OldValue;
	boolean ClickOparetor = false;
	boolean Second_Click_Oparator = false;
	float Result;
	String Select_Oparator = "Equal";
	boolean letterExists = false;
	boolean Zero_Clicked=false;

	String Check;
//	boolean Equal_Button_Clicked=false;
	// JButton Seven_Button;

	public MyFrame() {

		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(610, 750);
		jf.setLocation(300, 150);
		jf.getContentPane().setBackground(Color.getHSBColor(60, 50, 50));

		DisplayLabel = new JLabel("");
		DisplayLabel.setBounds(39, 32, 521, 55);
		DisplayLabel.setForeground(Color.BLACK);
		DisplayLabel.setBackground(Color.white);
		DisplayLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setOpaque(true);
		jf.add(DisplayLabel);

//		buttons

		Seven_Button = new JButton("7");
		Seven_Button.setBounds(39, 116, 112, 91);
		Seven_Button.setForeground(Color.black);
		Seven_Button.setBackground(Color.LIGHT_GRAY);

		Seven_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Seven_Button);
		Seven_Button.addActionListener(this);

		Eight_Button = new JButton("8");
		Eight_Button.setBounds(175, 116, 112, 91);
		Eight_Button.setForeground(Color.black);
		Eight_Button.setBackground(Color.LIGHT_GRAY);
		Eight_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Eight_Button);
		Eight_Button.addActionListener(this);

		Nine_Button = new JButton("9");
		Nine_Button.setBounds(311, 116, 112, 91);
		Nine_Button.setForeground(Color.black);
		Nine_Button.setBackground(Color.LIGHT_GRAY);
		Nine_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Nine_Button);
		Nine_Button.addActionListener(this);

		Sum_Button = new JButton("+");
		Sum_Button.setBounds(447, 116, 112, 91);
		Sum_Button.setForeground(Color.black);
		Sum_Button.setBackground(Color.LIGHT_GRAY);
		Sum_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Sum_Button);
		Sum_Button.addActionListener(this);

//		third row

		Four_Button = new JButton("4");
		Four_Button.setBounds(39, 236, 112, 91);
		Four_Button.setForeground(Color.black);
		Four_Button.setBackground(Color.LIGHT_GRAY);
		Four_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Four_Button);
		Four_Button.addActionListener(this);

		Five_Button = new JButton("5");
		Five_Button.setBounds(175, 236, 112, 91);
		Five_Button.setForeground(Color.black);
		Five_Button.setBackground(Color.LIGHT_GRAY);
		Five_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Five_Button);
		Five_Button.addActionListener(this);

		Six_Button = new JButton("6");
		Six_Button.setBounds(311, 236, 112, 91);
		Six_Button.setForeground(Color.black);
		Six_Button.setBackground(Color.LIGHT_GRAY);
		Six_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Six_Button);
		Six_Button.addActionListener(this);

		Sub_Button = new JButton("-");
		Sub_Button.setBounds(447, 236, 112, 91);
		Sub_Button.setForeground(Color.black);
		Sub_Button.setBackground(Color.LIGHT_GRAY);
		Sub_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Sub_Button);
		Sub_Button.addActionListener(this);

//		fourth row

		One_Button = new JButton("1");
		One_Button.setBounds(39, 356, 112, 91);
		One_Button.setForeground(Color.black);
		One_Button.setBackground(Color.LIGHT_GRAY);
		One_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(One_Button);
		One_Button.addActionListener(this);

		Two_Button = new JButton("2");
		Two_Button.setBounds(175, 356, 112, 91);
		Two_Button.setForeground(Color.black);
		Two_Button.setBackground(Color.LIGHT_GRAY);
		Two_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Two_Button);
		Two_Button.addActionListener(this);

		Three_Button = new JButton("3");
		Three_Button.setBounds(311, 356, 112, 91);
		Three_Button.setForeground(Color.black);
		Three_Button.setBackground(Color.LIGHT_GRAY);
		Three_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Three_Button);
		Three_Button.addActionListener(this);

		Div_Button = new JButton("/");
		Div_Button.setBounds(447, 356, 112, 91);
		Div_Button.setForeground(Color.black);
		Div_Button.setBackground(Color.LIGHT_GRAY);
		Div_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Div_Button);
		Div_Button.addActionListener(this);

//		fifth row

		Clear_Button = new JButton("c");
		Clear_Button.setBounds(39, 476, 112, 91);
		Clear_Button.setForeground(Color.black);
		Clear_Button.setBackground(Color.LIGHT_GRAY);
		Clear_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Clear_Button);
		Clear_Button.addActionListener(this);

		Dote_Button = new JButton(".");
		Dote_Button.setBounds(175, 476, 112, 91);
		Dote_Button.setForeground(Color.black);
		Dote_Button.setBackground(Color.LIGHT_GRAY);
		Dote_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Dote_Button);
		Dote_Button.addActionListener(this);

		Equel_Button = new JButton("=");
		Equel_Button.setBounds(447, 476, 112, 91);
		Equel_Button.setForeground(Color.black);
		Equel_Button.setBackground(Color.LIGHT_GRAY);
		Equel_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Equel_Button);
		Equel_Button.addActionListener(this);

		Zero_Button = new JButton("0");
		Zero_Button.setBounds(311, 476, 112, 91);
		Zero_Button.setForeground(Color.black);
		Zero_Button.setBackground(Color.LIGHT_GRAY);
		Zero_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Zero_Button);
		Zero_Button.addActionListener(this);
		
		
	//	sixth row

		Multiplication_Button = new JButton("x");
		Multiplication_Button.setBounds(39, 596, 112, 91);
		Multiplication_Button.setForeground(Color.black);
		Multiplication_Button.setBackground(Color.LIGHT_GRAY);
		Multiplication_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Multiplication_Button);
		Multiplication_Button.addActionListener(this);

		Delete_Button = new JButton("del");
		Delete_Button.setBounds(175, 596, 112, 91);
		Delete_Button.setForeground(Color.black);
		Delete_Button.setBackground(Color.LIGHT_GRAY);
		Delete_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Delete_Button);
		Delete_Button.addActionListener(this);

		Persentage_Button = new JButton("%");
		Persentage_Button.setBounds(447, 596, 112, 91);
		Persentage_Button.setForeground(Color.black);
		Persentage_Button.setBackground(Color.LIGHT_GRAY);  
		Persentage_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Persentage_Button);
		Persentage_Button.addActionListener(this);

		Squareroot_Button = new JButton("sqrt");
		Squareroot_Button.setBounds(311, 596, 112, 91);
		Squareroot_Button.setForeground(Color.black);
		Squareroot_Button.setBackground(Color.LIGHT_GRAY);
		Squareroot_Button.setFont(new Font("Verdana", Font.PLAIN, 45));
		jf.add(Squareroot_Button);
		Squareroot_Button.addActionListener(this);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		jf.getContentPane().setBackground(Color.blue);
		if (e.getSource() == Seven_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("7");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "7");
			}

		} else if (e.getSource() == Eight_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("8");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "8");
			}

		} else if (e.getSource() == Nine_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("9");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "9");
			}
		} else if (e.getSource() == Six_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("6");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "6");
			}
		} else if (e.getSource() == Five_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("5");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "5");
			}
		} else if (e.getSource() == Four_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("4");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "4");
			}
		} else if (e.getSource() == Three_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("3");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "3");
			}
		} else if (e.getSource() == Two_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("2");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "2");
			}
		} else if (e.getSource() == One_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("1");
				ClickOparetor = false;
			} else {
				DisplayLabel.setText(DisplayLabel.getText() + "1");
			}
		} else if (e.getSource() == Zero_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText("0");
				ClickOparetor = false;
			} else if(DisplayLabel.getText()=="0" ) {
				DisplayLabel.setText("0");
			}
			else if (DisplayLabel.getText()!="0" ) {
				DisplayLabel.setText(DisplayLabel.getText() + "0");
				
				
			}
		//	zero button is error stage
//			if (ClickOparetor) {
//				DisplayLabel.setText("0");
//				ClickOparetor = false;
//			} else {
//				Check = DisplayLabel.getText();
//				if (Check.charAt(0) == '0') {
//
//				} else if (Check.charAt(0) != '0') {
//					DisplayLabel.setText(DisplayLabel.getText() + "0");
//				}
//			}

		} else if (e.getSource() == Dote_Button) {
			if (ClickOparetor) {
				DisplayLabel.setText(".");
				ClickOparetor = false;
			} else {
				Check = DisplayLabel.getText();

				for (int i = 0; i < Check.length(); i++) {
					if (Check.charAt(i) == '.') {
						letterExists = true;
						break;
					}
				}

				if (letterExists) {

				} else {
					DisplayLabel.setText(DisplayLabel.getText() + ".");
				}

			}

		} else if (e.getSource() == Clear_Button) {
			OldValue = 0;
			Result = 0;
			DisplayLabel.setText("");
		}

		// Oparation

		else if (e.getSource() == Sum_Button) {
			if (ClickOparetor == false && Second_Click_Oparator == false) {
				Result = Float.parseFloat(DisplayLabel.getText());
				ClickOparetor = true;
				Second_Click_Oparator = true;

			}

			else if (ClickOparetor == false && Second_Click_Oparator) {
				Result = Result + Float.parseFloat(DisplayLabel.getText());
				DisplayLabel.setText("" + Result);
				Result = Float.parseFloat(DisplayLabel.getText());
				ClickOparetor = true;

			}
			Select_Oparator = "Sum";

		} else if (e.getSource() == Sub_Button) {
			if (ClickOparetor == false && Second_Click_Oparator == false) {
				Result = Float.parseFloat(DisplayLabel.getText());
				ClickOparetor = true;
				Second_Click_Oparator = true;
			}

			else if (ClickOparetor == false && Second_Click_Oparator) {
				Result = Result - Float.parseFloat(DisplayLabel.getText());
				DisplayLabel.setText("" + Result);
				Result = Float.parseFloat(DisplayLabel.getText());
				ClickOparetor = true;

			}
			Select_Oparator = "Sub";

		} else if (e.getSource() == Div_Button) {
			if (ClickOparetor == false && Second_Click_Oparator == false) {
				Result = Float.parseFloat(DisplayLabel.getText());
				ClickOparetor = true;
				Second_Click_Oparator = true;
			}

			else if (ClickOparetor == false && Second_Click_Oparator) {
				Result = Result / Float.parseFloat(DisplayLabel.getText());
				DisplayLabel.setText("" + Result);
				Result = Float.parseFloat(DisplayLabel.getText());
				ClickOparetor = true;

			}
			Select_Oparator = "Div";

		}

		else if (e.getSource() == Equel_Button) {

			switch (Select_Oparator) {
			case "Sum":
				if (Result != 0) {
					Result = Result + Float.parseFloat(DisplayLabel.getText());
					DisplayLabel.setText("" + Result);

				} else {
					DisplayLabel.setText(DisplayLabel.getText());
				}
				ClickOparetor = true;

				break;
			case "Sub":
				if (Result != 0) {
					Result = Result - Float.parseFloat(DisplayLabel.getText());
					DisplayLabel.setText("" + Result);

				} else {
					DisplayLabel.setText(DisplayLabel.getText());
				}
				ClickOparetor = true;

				break;
			case "Div":
				if (Result != 0) {
					Result = Result / Float.parseFloat(DisplayLabel.getText());
					DisplayLabel.setText("" + Result);

				} else {
					DisplayLabel.setText(DisplayLabel.getText());
				}
				ClickOparetor = true;

				break;
			case "Equal":

				DisplayLabel.setText(DisplayLabel.getText());

				break;

			default:

				break;
			}
		}

	}

}