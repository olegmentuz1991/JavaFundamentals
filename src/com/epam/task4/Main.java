package com.epam.task4;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int comp = 1;
        for (int i =0; i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
            comp*=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        System.out.println(comp);
    }
}
