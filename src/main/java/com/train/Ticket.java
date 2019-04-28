package com.train;

public class Ticket {
    int totaltrikets,roundtip,total;
    int totaltriketsprice=1000;
    int discount=9;
    int roundtipprice=2000;

    public Ticket(int totaltrikets,int roundtip){
        this.totaltrikets=totaltrikets;
        this.roundtip=roundtip;
        this.total=(totaltrikets-roundtip)*totaltriketsprice+roundtip*roundtipprice*discount/10;
    }

    public void print(){
        System.out.println("Total tickets:"+totaltrikets);
        System.out.println("Round-trip:"+roundtip);
        System.out.println("Total:"+total);
    }


}
