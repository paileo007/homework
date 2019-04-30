package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totaltikets=0;

        while(totaltikets!=-1){
            System.out.println("Please enter number of tickets: ");
            totaltikets=scanner.nextInt();
            if(totaltikets != -1){
                System.out.println("How many round-trip tickets: ");
                int roundtrip=scanner.nextInt();
                Ticket ticket=new Ticket(totaltikets,roundtrip);
                ticket.print();
            }
        }

    }
}
