package UYGULAMALAR

fun main(args: Array<String>) {


    println("Birinci sayisi giriniz: ")
    var sayi1: Int= readLine()!!.toInt()
    println("İkimci sayisi giriniz : ")
    var sayi2: Int= readLine()!!.toInt()
    println("Ücüncü sayisi giriniz: ")
    var sayi3: Int=readLine()!!.toInt()

    var  ortalama : Any = (sayi1+sayi2+sayi3)/3


    println("Ortalama: " +ortalama)









}