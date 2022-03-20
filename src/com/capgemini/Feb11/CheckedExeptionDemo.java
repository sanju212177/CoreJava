package com.capgemini.Feb11;

import java.io.*;
public class CheckedExeptionDemo {
	public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("demoText.txt");
            fos.write("Welcome Back!".getBytes());
            System.out.println("File Created");
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
