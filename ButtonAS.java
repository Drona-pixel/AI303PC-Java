import java.awt.*;
import javax.swing.*;

class ButtonAS{
	Button b; JButton jb; JFrame jf;
	ButtonAS(){
	
	jf = new JFrame("ButtonDemo");
	jf.setVisible(true);
	jf.setSize(500,500);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLayout(new FlowLayout());
	
	b= new Button("AWT"); jb = new JButton("SWING");
	jf.add(b); jf.add(jb);
}
	public static void main(String...args){
	
	ButtonAS bas = new ButtonAS();
}
}