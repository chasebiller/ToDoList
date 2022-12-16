package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author Chase Biller
 */
public class ButtonPanel extends JPanel{
    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    //Contructor
    ButtonPanel(){
        this.setPreferredSize(new Dimension(400,60));

        addTask = new JButton("Add A Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-Seriff", Font.PLAIN, 20));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Clear Finished Tasks");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-Seriff", Font.PLAIN, 20));
        this.add(clear);
    }
    public JButton getAddTask(){
        return addTask;
    }
    public JButton getClear(){
        return clear;
    }

}
