package FonksiyonlarMethotlar

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer

fun main(args: Array<String>) {

 //isimYazdır()
   // paramtereAl("Mami Akgöz",29)
    hesapMakinesi(18,9)


}

fun isimYazdır() {

    println("Mami Akgöz <3")
}

fun paramtereAl (isim:String, yas:Byte){

    println(isim)
    println("Yaşım :" +yas)
}

fun hesapMakinesi(sayi1:Int,sayi2:Int){

    println("HesapMakinesi\n.................")
    println("1-TOPLA")
    println("2-CIKAR")
    println("3-CARP")
    println("4-BÖL")

    println("$sayi1 ve $sayi2 ile yapmak istediğiniz işlemi seçin : ")
    var islem:Int = readLine()!!.toInt()

    if(islem == 1)
        println("Toplam: " + (sayi1+sayi2))
     else if (islem==2)
        println("CIKARMA: "+ (sayi1-sayi2))
    else if (islem ==3)
        println("CARPMA: "+ (sayi1*sayi2))
    else if (islem==4)
        println("BÖLME: "+ (sayi1/sayi2))
    else
        println("Böyle bir işlem yok.")


}