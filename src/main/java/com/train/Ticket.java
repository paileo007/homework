package com.train;

public class Ticket {
    int totalTikets,roundTrip,total;
    int onewayTiketsprice=1000;
    int roundTripprice=2000;
    int discount=9;

    public Ticket(int totalTikets,int roundTrip){
        this.totalTikets=totalTikets;
        this.roundTrip=roundTrip;
        this.total=(totalTikets-roundTrip)*onewayTiketsprice+roundTrip*roundTripprice*discount/10;
    }

    public void print(){
        System.out.println("Total tickets:"+totalTikets);
        System.out.println("Round-trip:"+roundTrip);
        System.out.println("Total:"+total);
    }

}
