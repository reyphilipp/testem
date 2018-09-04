package konto

/**
 * Created by admin on 04.09.2018.
 */
interface IKonto {
    fun zahleEin(betrag:Double):String
    fun getKontostand()
}