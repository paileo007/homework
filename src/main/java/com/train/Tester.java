package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totalTikets=0;

        while(totalTikets!=-1){
            System.out.println("Please enter number of tickets: ");
            totalTikets=scanner.nextInt();
            if(totalTikets != -1){
                System.out.println("How many round-trip tickets: ");
                int roundTrip=scanner.nextInt();
                Ticket ticket=new Ticket(totalTikets,roundTrip);
                ticket.print();
            }
        }

    }
}
