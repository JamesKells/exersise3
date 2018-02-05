package com.kells.exercise3;
import java.util.Scanner;
public class Main {

    static double temp = 32;

    public static void main(String[] args) {
        input();

        while(temp > -460){
            celsius();
            output();
            input();
        }
    }

    static void input() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your temp: ");
        temp = reader.nextDouble();
    }

    static void celsius() {
        temp = (temp - 32) * 5 / 9;
    }

    static void output(){
        System.out.println(temp);
    }



}
