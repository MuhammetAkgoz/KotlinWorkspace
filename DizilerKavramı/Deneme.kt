package DizilerKavramı

fun main() {

    println("Birinci sayiyi giriniz: ")
    var sayi1: Int= readLine()!!.toInt()
    println("İkinci sayiyi giriniz: ")
    var sayi2= readLine()!!.toInt()

    var sonuc: Int

    sonuc = ((sayi1*sayi2)+22/11+sayi2+sayi1/sayi2*2)
    println(sonuc)

}