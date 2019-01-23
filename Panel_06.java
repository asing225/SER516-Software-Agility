import java.awt.*;  
import javax.swing.*;
import javax.swing.border.BevelBorder;

/*
 * Author: Shefali Anand
 * GitID: 06
 * GitUser: shefaliAJ7
 * Date: 19 Jan 2019
 */

public class Panel_06 extends JPanel{
	
	Panel_06(){
		init();
	}
	
	public void init() {
		this.setBackground(Color.PINK);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
 		
		JLabel label1 = new JLabel("Shefali Anand", JLabel.CENTER);
		label1.setFont(new Font("Comic Sans MS", Font.BOLD,30));
		label1.setForeground(Color.BLUE);
		
		this.add(label1);
		
	}
	
}
