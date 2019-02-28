package com.pass;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class algo {
    private String pass="";
    private boolean signs,uper,numbers;
    private Random rand;
    private int size;

    public algo(ArrayList<JCheckBox> a,int size){
        signs = a.get(1).isSelected();
        uper= a.get(2).isSelected();
        numbers= a.get(0).isSelected();
        this.size=size;
        setPass();
    }

    private void setPass(){
        while(pass.length()<size){
            rand = new Random();
            int i =rand.nextInt(4);
            System.out.print(i);
            if (i==0&&numbers){
                pass+=""+rand.nextInt(9);
            }else if(i==1&&signs){
                pass+=setSign();
            }else if (i==2&&uper){
                pass+=setUpper();
            }else {
                pass+=setLower();
            }
        }
    }

    private char setSign(){
        String signs  = "!@#$%^&*_=+-/";
        Random rnd = new Random();
        int index = rnd.nextInt(signs.length());
        char c = signs.charAt(index);
        return c;
    }
    private char setUpper(){
        Random rnd = new Random();
        char c = (char) (rnd.nextInt(26) + 'A');
        return c;
    }

    private char setLower(){
        Random rnd = new Random();
        char c = (char) (rnd.nextInt(26) + 'a');
        return c;
    }

    public String getPass() {
        return pass;
    }

}
