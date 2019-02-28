package com.pass;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class passrand {
    private JFrame frame;
    private JPanel panel1;
    private JButton btn;
    private JCheckBox numbers;
    private JCheckBox signs;
    private JCheckBox upper;
    private JTextField password;
    private JButton copy;
    private JSlider slider1;
    private JLabel size;
    private algo pass;
    private ArrayList<JCheckBox> checkArray;


    public passrand() {



        size.setText(""+slider1.getValue());
        if (frame==null){
            frame = new JFrame("password generator");
        }

        checkArray = new ArrayList<JCheckBox>();
        checkArray.add(numbers);
        checkArray.add(signs);
        checkArray.add(upper);


        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                pass = new algo(getCheck(),slider1.getValue());
                password.setText(pass.getPass());

            }
        });
        copy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                StringSelection stringSelection = new StringSelection (password.getText());
                Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
                clpbrd.setContents (stringSelection, null);
            }
        });
        password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                password.selectAll();
            }
        });

        slider1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                size.setText(""+slider1.getValue());
            }
        });
    }

    public JFrame getJframe(){return frame;}
    public JPanel getJpanel(){
        return panel1;
    }
    public ArrayList<JCheckBox> getCheck(){return checkArray;}

    }
