package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner= Scanner(System.`in`)
    var totalTrikets=0

    while(totalTrikets!=-1){
        print("Please enter number of tickets: ")
        totalTrikets=scanner.nextInt()
        if(totalTrikets!=-1){
            print("How many round-trip tickets: ")
            var roundtrip=scanner.nextInt()
            var tricketKotlin=TricketKotlin(totalTrikets,roundtrip)
            tricketKotlin.print()
        }
    }
}


class TricketKotlin(var totalTikets:Int,var roundTrip:Int){
    var onewayTiketsprice=1000
    var roundTipprice=2000
    var discount=9
    var total=(totalTikets-roundTrip)*onewayTiketsprice+roundTrip*roundTipprice*discount/10

    fun print(){
        println("Total tickets:$totalTikets\nRound-trip:$roundTrip\nTotal:$total")
    }
}