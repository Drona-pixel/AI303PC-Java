import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SimpleCal implements ActionListener{

	JFrame jf;
	JLabel fv,sv,res;
	JTextField fvt,svt,rest;
	JButton b1,b2,b3,b4;

	SimpleCal(){
		JPanel jp = new JPanel(new GridLayout(5,2,25,25));
		jf = new JFrame("CALCULATOR");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jp);

		fv = new JLabel("Enter first value:");
		sv = new JLabel("Enter second value:");
		res = new JLabel("output is:");

		fvt = new JTextField(2);
		svt = new JTextField(2);
		rest = new JTextField(2);

		b1 = new JButton("add");b1.addActionListener(this);
		b2 = new JButton("sub");b2.addActionListener(this);
		b3 = new JButton("mul");b3.addActionListener(this);
		b4 = new JButton("div");b4.addActionListener(this);

		jp.add(fv); jp.add(fvt);
		jp.add(sv); jp.add(svt);
		jp.add(b1);jp.add(b2);
		jp.add(b3);jp.add(b4);
		jp.add(res); jp.add(rest);

	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("add")){
			try{
				int a = Integer.parseInt(fvt.getText());
				int b = Integer.parseInt(svt.getText());
				rest.setText(String.valueOf(a+b));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else if(ae.getActionCommand().equals("sub")){
			try{
				int a = Integer.parseInt(fvt.getText());
				int b = Integer.parseInt(svt.getText());
				rest.setText(String.valueOf(a-b));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else if(ae.getActionCommand().equals("mul")){
			try{
				int a = Integer.parseInt(fvt.getText());
				int b = Integer.parseInt(svt.getText());
				rest.setText(String.valueOf(a*b));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else{
			try{
				int a = Integer.parseInt(fvt.getText());
				int b = Integer.parseInt(svt.getText());
				rest.setText(String.valueOf(a/b));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String...args){
		SimpleCal sc = new SimpleCal();
	}
}