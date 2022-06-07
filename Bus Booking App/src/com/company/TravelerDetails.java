package com.company;

public class TravelerDetails {
    public void viewAllTravelerDetails(){
        if (NewTraveler.travelerDetails.size()>0){
            System.out.println("\n----------------------------------------------------------------------------------------------------------");
            System.out.format("%10s %20s %20s %20s %20s", "SeatNumber" , " Name " , "From " , " TO " , "Phone Number");
            System.out.println("\n----------------------------------------------------------------------------------------------------------");
            for (Traveler t: NewTraveler.travelerDetails){
                System.out.printf("%10s %20s %20s %20s %20s",t.getSeatNumber(),t.getName(),t.getStartPosition()
                        ,t.getDestination() , t.getPhoneNumber() +"\n");
            }
        }
        else{
            System.err.println("There is No Data To Show Kindly Book Ticket  ");
        }

    }
    public void viewSpecificTraveler(int seatNumber){
        boolean matched = false;
        for (Traveler t:NewTraveler.travelerDetails) {
            if (t.getSeatNumber()==seatNumber){
                matched = true;
            }
        }
        if (matched){
            for (Traveler t: NewTraveler.travelerDetails){
                if (t.getSeatNumber() == seatNumber){
                    System.out.println("\n---------------------------------------------------------------------------------------------------");
                    System.out.format("%10s %20s %20s %20s %20s", "SeatNumber" , " Name " , "From " , " TO " , "Phone Number");
                    System.out.println("\n---------------------------------------------------------------------------------------------------");
                    System.out.printf("%10s %20s %20s %20s %20s",t.getSeatNumber(),t.getName(),t.getStartPosition()
                            ,t.getDestination() , t.getPhoneNumber() +"\n");
                }
            }
        }

        else{
            System.out.println("\n No One Booked Seat Number : " +seatNumber +"\n If You are Interest You Can Book This Seat");
        }

    }
}
