package com.epam.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int count = reader.read();
            for (int i =0; i<count; i++){
                System.out.println(Math.random()*100);
            }
            for (int i =0; i<count; i++){
                System.out.print(Math.random()*100 + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
