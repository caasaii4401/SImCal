package com.example.simcal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalController {
    @FXML
    private TextField text_result;
    String op ="";
    long number1;
    long number2;
    // First Method
    public void Number (ActionEvent ae){
        String no = ((Button)ae.getSource()).getText();
        text_result.setText(text_result.getText()+no);
    }

    // Second Method
    public void Operation (ActionEvent ae){

        String operation = ((Button)ae.getSource()).getText();
        if (!operation.equals("=")){
            if(!op.equals("")){
                return;
            }
            op = operation;
            number1 = Long.parseLong(text_result.getText());
            text_result.setText("");
        }else {
            if(op.equals("")){
                return;
            }
            number2 = Long.parseLong(text_result.getText());
            calculate(number1, number2, op);
            op="";
        }
    }
    // 3 Methode
    public void calculate (long n1, long n2, String op){

        switch (op){

            case "+" : text_result.setText(n1 + n2 + "");break;
            case "-" : text_result.setText(n1 - n2 + "");break;
            case "*" : text_result.setText(n1 * n2 + "");break;
            case "/" :
                if (n2 == 0){
                    text_result.setText("0");break;
                }
                text_result.setText(n1/n2+ "");break;
        }
    }

}