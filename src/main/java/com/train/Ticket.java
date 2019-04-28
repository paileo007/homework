package com.train;

public class Ticket {
    int totaltikets,roundtrip,total;
    int onewaytiketsprice=1000;
    int roundtripprice=2000;
    int discount=9;

    public Ticket(int totaltikets,int roundtrip){
        this.totaltikets=totaltikets;
        this.roundtrip=roundtrip;
        this.total=(totaltikets-roundtrip)*onewaytiketsprice+roundtrip*roundtripprice*discount/10;
    }

    public void print(){
        System.out.println("Total tickets:"+totaltikets);
        System.out.println("Round-trip:"+roundtrip);
        System.out.println("Total:"+total);
    }

}
