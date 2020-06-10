package UYGULAMALAR

fun main(args: Array<String>) {


    println("Bir sayi giriniz: ")
    var fakt: Int= readLine()!!.toInt()

    var hesapla: Int =1
    for (i in fakt downTo 1)
    {
        hesapla=hesapla*i
    }

    println("$fakt sayisinin faktöriyeli : "+hesapla)








}