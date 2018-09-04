package bank

import konto.IKonto


class Bank(val iKonto:IKonto) {
    fun zahlEinTest(){
        if (iKonto.zahleEin(44.8)=="einbezahlt"){
            println("Einzahlung IO")
        }else if (iKonto.zahleEin(44.8)=="nicht einbezahlt"){
            println("Einzahlung NIO")
        }else{
            throw IllegalStateException("Zahlung Error")
        }

    }
}