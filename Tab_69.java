/** Tab5 containing 20 panel
 * Author: Jahnvi Rai jrai4
 */

import javax.swing.*;
import java.awt.*;


public class Tab_69 extends JPanel {

    //Method called from the main frame to access the tab name
    public String getName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    private String tabName = "Jahnvi";

    //List of panel classes to be added
    private String[] panelNames = {"Panel_01","Panel_12","Panel_14","Panel_19","Panel_51","Panel_78",
            "Panel_89","Panel_62","Panel_37","Panel_66","Panel_72","Panel_67","Panel_64","Panel_75",
            "Panel_50", "Panel_XX","Panel_XX","Panel_XX","Panel_XX","Panel_XX"};


    // Default constructor
    Tab_69() {
        this.setLayout(new GridLayout(5,4));
        addPanel();

   }
    //Method to check for existing class panels and add them
    private void addPanel(){
        for(int i =0;i<panelNames.length;i++){
            try{
                Class<?> clazz = Class.forName(panelNames[i]);
                Object newPanel = clazz.getDeclaredConstructor().newInstance();
                this.add((JPanel)newPanel);
            }
            catch (Exception e){
                JPanel newPanel = new JPanel();
                newPanel.add(new JLabel("Panel Missing " + panelNames[i]));
                this.add(newPanel);
            }
        }

    }

}