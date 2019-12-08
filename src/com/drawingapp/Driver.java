package com.drawingapp;

/**
 * Starting point for the application
 */
public class Driver {
    public static void main(String args[]){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drwaing().setVisible(true);
            }
        });
    }
}
