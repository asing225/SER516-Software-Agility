import javax.swing.*;
import java.awt.*;

/*
 * Author: Nikhila Saini
 * GitID: 70
*/

public class Panel_70 extends JPanel {

    JLabel labelName;
    JLabel labelMessage = new JLabel("Hi");

    public Panel_70() {
        labelName = new JLabel("Nikhila Saini");
        labelName.setFont(new Font("Algerian", Font.BOLD, 24));
	    this.setBackground(Color.CYAN);
        this.add(labelName);

        
        labelMessage.setFont(new Font("Algerian", Font.BOLD, 24));
        this.add(labelMessage);
        labelMessage.setVisible(false);
    }

    public void sayHi(boolean flag){
        if(flag)
            labelMessage.setVisible(true);
        else
            labelMessage.setVisible(false);
    }
}
