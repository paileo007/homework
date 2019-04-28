package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner= Scanner(System.`in`)

    print("Please enter number of tickets: ")
    var totaltrikets=scanner.nextInt()

    print("How many round-trip tickets: ")
    var roundtrip=scanner.nextInt()

    var tricketKotlin=TricketKotlin(totaltrikets,roundtrip)
    tricketKotlin.print()
}


class TricketKotlin(var totaltrikets:Int,var roundtrip:Int){
    var onewaytriketsprice=1000;
    var roundtipprice=2000;
    var discount=9;
    var total=(totaltrikets-roundtrip)*onewaytriketsprice+roundtrip*roundtipprice*discount/10

    fun print(){
        println("Total tickets:"+totaltrikets);
        println("Round-trip:"+roundtrip);
        println("Total:"+total);
    }
}