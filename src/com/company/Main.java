package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        textEditorGui obj = new textEditorGui();
        obj.setBounds(0,0,700,700);

        obj.setTitle("Notepad");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
