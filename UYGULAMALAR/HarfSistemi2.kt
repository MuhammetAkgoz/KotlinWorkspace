package UYGULAMALAR

fun main(args: Array<String>) {

    println("Notunuzu girin: ")
    var not: Int= readLine()!!.toInt()

    var notum= (not)-(not%10)

    var sonuc=when(notum)
    {
       90->"AA"
       80->"BA"
       70->"BB"
       60->"CB"
       50->"CC"
       else->
           "FF"
    }

    println("Harf notunuz: "+sonuc)
}