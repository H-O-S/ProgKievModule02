package Lesson03.Task01;

import Lesson03.Exception.NegativeValueException;

import javax.swing.*;

public class MainL03Task01 {
    public static void main(String[] args) {
        double a;
        for(;;){

            try{
                a=Double.valueOf(JOptionPane.showInputDialog("Input double number"));
                if (a < 0){
                    throw  new NegativeValueException("Negative number !!!");
                }
                break;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error number format");
            }
            catch(NullPointerException e){
                a = 0;
                JOptionPane.showMessageDialog(null,"Cancel");
                break;
            }
            catch(NegativeValueException e) {
                JOptionPane.showMessageDialog(null, e.getUserMessage());
            }
        }
        System.out.println(a);
    }
}
