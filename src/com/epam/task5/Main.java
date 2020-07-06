package com.epam.task5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String monthString;
            String month = reader.readLine();
            switch (Integer.parseInt(month)) {
                case 1:
                    monthString = "Январь";
                    break;
                case 2:
                    monthString = "Февраль";
                    break;
                case 3:
                    monthString = "Март";
                    break;
                case 4:
                    monthString = "Апрель";
                    break;
                case 5:
                    monthString = "Май";
                    break;
                case 6:
                    monthString = "Июнь";
                    break;
                case 7:
                    monthString = "Июль";
                    break;
                case 8:
                    monthString = "Август";
                    break;
                case 9:
                    monthString = "Сентябрь";
                    break;
                case 10:
                    monthString = "Октябрь";
                    break;
                case 11:
                    monthString = "Ноябрь";
                    break;
                case 12:
                    monthString = "Декабрь";
                    break;
                default:
                    monthString = "Не знаем такого";
                    break;
            }
            System.out.println(monthString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }

