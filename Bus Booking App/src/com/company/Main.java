package com.company;

import java.util.Scanner;

public class Main {
    public static void start() {

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("                     WELCOME TO RED BUS TICKET BOOKING                                                                   ");
        System.out.println("-------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        Availability availSeat = new Availability();
        availSeat.availability();

        TravelerDetails detailsOfTraveler = new TravelerDetails();

        FromToDestination locations = new FromToDestination();

        NewTraveler addTraveler = new NewTraveler();


        boolean condition = true;
        while (condition) {
            System.out.println("\n  Enter 1 To Set Starting And Ending Location");
            System.out.println("  Enter 2 To View Seats Availability");
            System.out.println("  Enter 3 To Book Ticket");
            System.out.println("  Enter 4 To View All Traveler Details");
            System.out.println("  Enter 5 To view particular Traveler");
            System.out.println("  Enter 6 To Cancel Ticket");
            System.out.println("  Enter 7 To Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    String start_location;
                    String end_Location;
                    System.out.println("Enter Starting Location");
                    start_location = sc.nextLine();
                    System.out.println("Enter Ending Location");
                    end_Location = sc.nextLine();

                    locations.setStartingLocation(start_location);
                    locations.setDestination(end_Location);
                    break;

                case 2:
                    System.out.println("\n Available Seats");
                    System.out.println("Here , 0 =  Booked Seats The Remaining Are Available Seat Numbers  ");

                    availSeat.seatAvailability();
                    break;
                case 3:
                    System.out.println("Enter Seat Number");
                    int seatNumber = sc.nextInt();
                    sc.nextLine();
                    int[] seatIndex = new int[3];
                    if(Availability.bookedTicket.contains(seatNumber)){

                        System.out.println("oops ! , The Seat Number is Already Booked ");
                    }
                    else{
                        availSeat.Book(seatNumber);
                       // int seatNumber1 = seatIndex[2];

                        addTraveler.newTraveler(seatNumber,locations.getStarting_Location(), locations.getDestination());
                        System.out.println("\n Ticket Booked Successfully");
                    }

                   break;
                case 4:
                    detailsOfTraveler.viewAllTravelerDetails();
                    break;
                case 5:
                    System.out.println("Enter SeatNumber Of A Traveler");
                    int seat = sc.nextInt();
                    detailsOfTraveler.viewSpecificTraveler(seat);
                    break;
                case 6:
                    System.out.println("Enter seat Number To Cancel ");
                    int seatNo = sc.nextInt();

                    if(Availability.bookedTicket.contains(seatNo)){
                       // int index = Availability.bookedTicket.indexOf(seatNo);
                        availSeat.cancelTicket(seatNo);
                        addTraveler.deleteTraveler(seatNo);
                        System.out.println("\n Canceled Ticket Successfully");
                    }
                    else {
                        System.out.println("\n No One Booked Seat Number : " +seatNo +"\n If You are Interest You Can Book This Seat");
                    }

                    //System.out.println("\n Canceled Ticket Successfully");
                    break;
                case 7:
                    System.out.println("Do You Wants To Exit");
                    System.out.println("Enter 1 For Yes");
                    System.out.println("Enter 2 For No");
                    int exitChoice = sc.nextInt();
                    if (exitChoice == 1) {
                        condition = false;
                    }
                default:
                        System.out.println("\nInvalid Input");
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
            Main.start();
    }
}

