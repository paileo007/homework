package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int  totaltikets=scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int roundtrip=scanner.nextInt();

        Ticket ticket=new Ticket(totaltikets,roundtrip);
        ticket.print();
    }
}
