package com.pass;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main (String[] arg){

        passrand pas = new passrand();
        pas.getJframe().setContentPane(pas.getJpanel() );
        pas.getJframe().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        pas.getJframe().setLocation(dim.width/3-pas.getJframe().getSize().width/3, dim.height/3-pas.getJframe().getSize().height/3);
        pas.getJframe().pack();
        pas.getJframe().setResizable(false);
        pas.getJframe().setVisible(true);

    }
}
