package UYGULAMALAR

fun main(args: Array<String>) {

    println("Vize notunu giriniz: ")
    var vize: Int= readLine()!!.toInt()
    println("Final notunu giriniz: ")
    var final: Int= readLine()!!.toInt()


    var ortalama: Any

    ortalama= (vize*0.4)+(final*0.6)

    if (ortalama>=50)
        println("Tebrikler geçtiniz.($ortalama)")
    else
        println("Hic mi birşey öğrenmedin aq.($ortalama)")

}