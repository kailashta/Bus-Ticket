package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Availability {


    int[] seats = new int[50];
    int seatCount =0;
    static ArrayList<Integer> bookedTicket = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void availability(){

        for( int i = 0 ; i < seats.length ; i++ ){
            seats[i] = i+1;
        }
    }
    public void Book(int seatNumber){

        for (int i=0;i< seats.length;i++){
            if (seats[i]==seatNumber){
                bookedTicket.add(seatNumber);
                seats[i] = 0;
                seatCount++;
            }
        }

    }

    public void cancelTicket(int seatNo){

        boolean deleted = false;
        for (int i=0;i<seats.length;i++){
            if (i==seatNo-1){
                seats[i] = seatNo;
                seatCount++;
            }
        }

    }
    public void seatAvailability(){
        System.out.println();
        for (int i=0;i<50;i++){
            if (i<10){
                System.out.print(seats[i]+"  ");
            }
            else{
                System.out.print(seats[i]+" ");
            }

            if (i>0){
                if ((i+1)%5==0){
                    System.out.println();
                }

            }

        }
        if (seatCount == 40){
            System.out.println("\nAll Seats Are Booked");
        }
        else if (seatCount>=1 && seatCount <40){
            System.out.println("\n" + (40 - seatCount )+ " Seats Available");
        }
    }
}