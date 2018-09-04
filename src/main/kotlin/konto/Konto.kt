package konto

abstract class Konto(private val ktoNummer:String) :IKonto{

    override abstract fun zahleEin(betrag:Double):String

    override abstract fun getKontostand()

}