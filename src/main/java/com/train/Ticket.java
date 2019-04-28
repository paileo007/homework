package com.train;

public class Ticket {
    int totaltrikets,roundtrip,total;
    int onewaytriketsprice=1000;
    int roundtripprice=2000;
    int discount=9;

    public Ticket(int totaltrikets,int roundtrip){
        this.totaltrikets=totaltrikets;
        this.roundtrip=roundtrip;
        this.total=(totaltrikets-roundtrip)*onewaytriketsprice+roundtrip*roundtripprice*discount/10;
    }

    public void print(){
        System.out.println("Total tickets:"+totaltrikets);
        System.out.println("Round-trip:"+roundtrip);
        System.out.println("Total:"+total);
    }

}
