package FonksiyonlarMethotlar

import java.util.*
import kotlin.test.currentStackTrace


fun main() {


    var hesapMakinesi= hesapla()

    if(hesapMakinesi<0 || hesapMakinesi>5){
        println("Adam gibi kullan şu programı.")
        return
    }
    println("Birinci sayiyi giriniz : ")
    var sayi1: Int= readLine()!!.toInt()
    println("İkinci sayiyi giriniz: ")
    var sayi2: Int= readLine()!!.toInt()




    when(hesapMakinesi)
    {
       1-> toplamaYap(sayi1,sayi2)
       2-> cıkarmaYap(sayi1,sayi2)
       3-> bölmeYap(sayi1,sayi2)
       4-> çarpmaYap(sayi1,sayi2)

    }

}

fun çarpmaYap(sayi1:Int, sayi2:Int) {

    println("ÇARPMA:" + (sayi1*sayi2))
}
fun bölmeYap(sayi1:Int, sayi2:Int) {
    println("BÖLME:"+(sayi1/sayi2))
}

fun cıkarmaYap(sayi1:Int, sayi2:Int) {
    println("Çıkarma: "+(sayi1-sayi2))
}

fun toplamaYap(sayi1:Int, sayi2:Int ) {
    println("TOPLAM: "+(sayi1+sayi2))
}

fun hesapla(): Int{

    var tarih= tarihGoster()

    println("************HESAPLIYALIM |$tarih *********")
    println("1-TOPLA")
    println("2-CIKAR")
    println("3-BÖL")
    println("4-ÇARP")
    println("Seçiminiz: ")

    var secim: Int= readLine()!!.toInt()

    return secim

}

fun tarihGoster(): String {


        //Mami burası önemli:)
    val calendar=Calendar.getInstance()
    var saat= calendar.get(Calendar.HOUR)
    var dakika=calendar.get(Calendar.MINUTE)
    var saniye= calendar.get(Calendar.SECOND)

    return "$saat"+":$dakika"+":$saniye"




}
