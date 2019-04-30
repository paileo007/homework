package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner= Scanner(System.`in`)
    var totaltrikets=0

    while(totaltrikets!=-1){
        print("Please enter number of tickets: ")
        totaltrikets=scanner.nextInt()
        if(totaltrikets!=-1){
            print("How many round-trip tickets: ")
            var roundtrip=scanner.nextInt()
            var tricketKotlin=TricketKotlin(totaltrikets,roundtrip)
            tricketKotlin.print()
        }
    }
}


class TricketKotlin(var totaltikets:Int,var roundtrip:Int){
    var onewaytiketsprice=1000
    var roundtipprice=2000
    var discount=9
    var total=(totaltikets-roundtrip)*onewaytiketsprice+roundtrip*roundtipprice*discount/10

    fun print(){
        println("Total tickets:$totaltikets\nRound-trip:$roundtrip\nTotal:$total")
    }
}