import java.awt.*;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.prism.paint.Paint;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
public class Histograme extends JFrame {

	private JPanel contentPane;
	private JTextField text29;
	private JTextField text39;
	private JTextField text69;
	private JTextField text100;
	public static String z ;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Histograme frame = new Histograme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		z = "*******";

	}

	/**
	 * Create the frame.
	 */private Pattern gpat = Pattern.compile("[0-9]+");
	public Histograme() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Histograme.class.getResource("/res/New Image.jpg")));
		setTitle("Histograme");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0-29");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(15, 39, 50, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentHistograme = new JLabel("Student Histogram");
		lblStudentHistograme.setForeground(new Color(128, 0, 0));
		lblStudentHistograme.setBounds(133, 5, 233, 25);
		lblStudentHistograme.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblStudentHistograme);
		
		
		JLabel label = new JLabel("30-39");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(15, 85, 50, 35);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("40-69");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(15, 131, 50, 35);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("70-100");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(15, 177, 50, 35);
		contentPane.add(label_2);
		
		JLabel lblAverage = new JLabel("Average    ");
		lblAverage.setForeground(new Color(0, 0, 0));
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAverage.setBounds(81, 261, 193, 20);
		contentPane.add(lblAverage);
		
		JLabel lblHighestMark = new JLabel("Highest mark    ");
		lblHighestMark.setForeground(new Color(0, 0, 0));
		lblHighestMark.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHighestMark.setBounds(81, 292, 193, 20);
		contentPane.add(lblHighestMark);
		
		JLabel lblLowestMark = new JLabel("Lowest mark    ");
		lblLowestMark.setForeground(new Color(0, 0, 0));
		lblLowestMark.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLowestMark.setBounds(81, 323, 193, 20);
		contentPane.add(lblLowestMark);
		
		JLabel lblNoOfPassing = new JLabel("No. of passing students ");
		lblNoOfPassing.setForeground(new Color(0, 0, 0));
		lblNoOfPassing.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNoOfPassing.setBounds(81, 354, 193, 20);
		contentPane.add(lblNoOfPassing);
		
		JLabel lblPassingPresentage = new JLabel("Passing presentage ");
		lblPassingPresentage.setForeground(new Color(0, 0, 0));
		lblPassingPresentage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassingPresentage.setBounds(81, 385, 193, 20);
		contentPane.add(lblPassingPresentage);
		
		text29 = new JTextField();
		text29.setBackground(new Color(0, 128, 128));
		text29.setForeground(Color.RED);
		text29.setFont(new Font("Tahoma", Font.BOLD, 17));
		text29.setBounds(101, 48, 250, 20);
		contentPane.add(text29);
		text29.setColumns(10);
		text29.setEditable(false);
		
		
		text39 = new JTextField();
		text39.setBackground(new Color(0, 128, 128));
		text39.setForeground(new Color(255, 102, 0));
		text39.setFont(new Font("Tahoma", Font.BOLD, 17));
		text39.setEditable(false);
		text39.setColumns(10);
		text39.setBounds(101, 94, 250, 20);
		contentPane.add(text39);
		
		text69 = new JTextField();
		text69.setBackground(new Color(0, 128, 128));
		text69.setForeground(new Color(204, 204, 0));
		text69.setFont(new Font("Tahoma", Font.BOLD, 17));
		text69.setEditable(false);
		text69.setColumns(10);
		text69.setBounds(101, 140, 250, 20);
		contentPane.add(text69);
		
		text100 = new JTextField();
		text100.setBackground(new Color(0, 128, 128));
		text100.setForeground(new Color(51, 204, 0));
		text100.setFont(new Font("Tahoma", Font.BOLD, 17));
		text100.setEditable(false);
		text100.setColumns(10);
		text100.setBounds(101, 186, 250, 20);
		contentPane.add(text100);
		
		
		JLabel average = new JLabel("");
		average.setBounds(290, 266, 76, 14);
		contentPane.add(average);
		
		JLabel max = new JLabel("");
		max.setBounds(290, 297, 76, 14);
		contentPane.add(max);
		
		JLabel min = new JLabel("");
		min.setBounds(290, 328, 76, 14);
		contentPane.add(min);
		
		JLabel pass = new JLabel("");
		pass.setBounds(290, 359, 76, 14);
		contentPane.add(pass);
		
		JLabel passP = new JLabel("");
		passP.setBounds(290, 390, 76, 14);
		contentPane.add(passP);
		
		JLabel totalStu = new JLabel("Please input marks");
		totalStu.setForeground(new Color(0, 0, 0));
		totalStu.setBackground(new Color(0, 128, 128));
		totalStu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		totalStu.setBounds(51, 223, 250, 33);
		contentPane.add(totalStu);
		
		JButton btn = new JButton("Input marks");				//Button click
		ArrayList<Integer> gigaArray = new ArrayList<>();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int option;
				do {
				String[] options = {"Add mark","Finish"};
				JFrame gigaframe = new JFrame();
				JPanel gigapanel = new JPanel(new GridBagLayout());
				GridBagConstraints gigalay = new GridBagConstraints();
								
				JLabel lbl = new JLabel("ICT 01:");
				JTextField mark = new JTextField(5);
				gigalay.gridx = 0;
				gigalay.gridy = 1;
				gigalay.gridwidth = 1;
				gigapanel.add(lbl,gigalay);
				gigalay.gridx = 1;
				gigalay.gridy = 1;
				gigalay.gridwidth = 1;
				gigapanel.add(mark,gigalay);
				
				JLabel lbm2 = new JLabel("ICT 02:");
				JTextField mark2 = new JTextField(5);
				gigalay.gridx = 0;
				gigalay.gridy = 2;
				gigalay.gridwidth = 1;
				gigapanel.add(lbm2,gigalay);
				gigalay.gridx = 1;
				gigalay.gridy = 2;
				gigalay.gridwidth = 1;
				gigapanel.add(mark2,gigalay);
				
				
				JLabel lbm3 = new JLabel("CWK 01:");
				JTextField mark3 = new JTextField(5);
				gigalay.gridx = 0;
				gigalay.gridy = 3;
				gigalay.gridwidth = 1;
				gigapanel.add(lbm3,gigalay);
				gigalay.gridx = 1;
				gigalay.gridy = 3;
				gigalay.gridwidth = 1;
				gigapanel.add(mark3,gigalay);
				
				JLabel lbm4 = new JLabel("CWK 02:");
				JTextField mark4 = new JTextField(5);
				gigalay.gridx = 0;
				gigalay.gridy = 4;
				gigalay.gridwidth = 1;
				gigapanel.add(lbm4,gigalay);
				gigalay.gridx = 1;
				gigalay.gridy = 4;
				gigalay.gridwidth = 1;
				gigapanel.add(mark4,gigalay);
				
				JLabel lb2 = new JLabel("<html>Please click <u>Finish</u> to stop entering</html>");
				gigalay.gridx = 0;
				gigalay.gridy = 5;
				gigalay.gridwidth = 2;
				gigapanel.add(lb2,gigalay);
				
				gigaframe.getContentPane().add(gigapanel);
				ImageIcon icon = new ImageIcon(Histograme.class.getResource("/res/q.jpg"));
				Image image = icon.getImage();
				Image newimg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				option = JOptionPane.showOptionDialog(null, gigapanel, "ENTER MARKS", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,icon, options , options[0]);
				
				
				double moduleM = -1;
				if(option ==0) {
					if(!(mark.getText().matches("[-+]?\\d*\\.?\\d+"))||!(mark2.getText().matches("[-+]?\\d*\\.?\\d+"))
							||!(mark3.getText().matches("[-+]?\\d*\\.?\\d+"))||!(mark4.getText().matches("[-+]?\\d*\\.?\\d+"))) {
						JOptionPane.showMessageDialog(null,"Please Enter Valid marks");
						
					}else if( mark.getText().equals("") ||mark2.getText().equals("")||mark3.getText().equals("")||mark4.getText().equals(""))  {
							JOptionPane.showMessageDialog(null,"Please Enter all marks");
							
					}else if(Integer.parseInt(mark.getText()) >100 || Integer.parseInt(mark.getText()) < 0
							||Integer.parseInt(mark2.getText()) >100 || Integer.parseInt(mark2.getText()) < 0
							||Integer.parseInt(mark3.getText()) >100 || Integer.parseInt(mark3.getText()) < 0
							||Integer.parseInt(mark4.getText()) >100 || Integer.parseInt(mark4.getText()) < 0) {
						JOptionPane.showMessageDialog(null,"Please Enter Valid marks within (0-100)");
						
						
													
					}else	{
							moduleM = (Integer.parseInt(mark.getText())*.2)+(Integer.parseInt(mark2.getText())*.2)+(Integer.parseInt(mark3.getText())*.3)
											+(Integer.parseInt(mark4.getText())*.3);
							 
							gigaArray.add((int)moduleM);
					}
				  				  
				}
				/*if(option == 1) {
					System.out.println("Element:");				print array
					System.out.println(gigaArray);
			        
				}*/
				} while ( option != 1 ); 
				
				if (gigaArray.size() > 0) {
				Collections.sort(gigaArray);
				
				totalStu.setText(Integer.toString(gigaArray.size())+" number of students in total");					//Total
				
				min.setText(Integer.toString(gigaArray.get(0)));					//Max
				max.setText(Integer.toString(gigaArray.get(gigaArray.size()-1)));	//Min
				
				int averagem = 0;											//Average
				int total = 0;
				for(int x =0; gigaArray.size() > x; x++) {
					total += gigaArray.get(x);
					int count = gigaArray.size();
					averagem = total / count;
				}
				average.setText(Integer.toString(averagem));
				
				double passCount = 0;													//Pass
				for(int x =0; gigaArray.size() > x; x++) {
					if (gigaArray.get(x)>=30) {
						passCount++;
					}
				}
				pass.setText(Integer.toString((int)passCount));							//pass percentage
				
				double passPresent = (passCount / gigaArray.size())*100;
				DecimalFormat formatter = new DecimalFormat("#0.00"); 
				passP.setText((formatter.format(passPresent)+" %"));
				
				int count29 = 0;														//29 bar
				String bar29 = " ";
				for(int x : gigaArray) {
					if(x <= 29&&x >=0) {
						count29++;
					}
				}
				//System.out.println(count29);
				for(int x=0;x<count29;x++) {
					bar29 += (""+"*");
				}text29.setText(bar29);
				
				int count39 = 0;														//39 bar
				String bar39 = " ";
				for(int x : gigaArray) {
					if(x <= 39 && x >=30) {
						count39++;
					}
				}
				//System.out.println(count39);
				for(int x=0;x<count39;x++) {
					bar39 += (""+"*");
				}text39.setText(bar39);
				
				int count69 = 0;														//69 bar
				String bar69 = " ";
				for(int x : gigaArray) {
					if(x <= 69 && x >= 40) {
						count69++;
					}
				}
				//System.out.println(count69);
				for(int x=0;x<count69;x++) {
					bar69 += (""+"*");
				}text69.setText(bar69);
				
				int count100 = 0;														//100 bar
				String bar100 = " ";
				for(int x : gigaArray) {
					if(x <= 100 && x >= 70) {
						count100++;
					}
				}
				//System.out.println(count100);
				for(int x=0;x<count100;x++) {
					bar100 += (""+"*");
				}text100.setText(bar100);
				
				
				
			}	
			}
			
			
		});
		btn.setBounds(5, 10, 104, 23);
		contentPane.add(btn);
		
		JLabel label_3 = new JLabel(":");
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(268, 263, 28, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel(":");
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(268, 297, 28, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel(":");
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(268, 328, 28, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel(":");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(268, 359, 28, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel(":");
		label_7.setForeground(new Color(0, 0, 0));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(268, 390, 28, 14);
		contentPane.add(label_7);
		
		
		
		
	}
}
