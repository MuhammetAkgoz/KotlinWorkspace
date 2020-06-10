package NesneYonelimliProgramlama

class Dikdortgen(var en: Int=0, var boy: Int=0) {


 fun alanHesapla():Int{
     return this.en * this.boy

    }


}

fun main(args: Array<String>) {

    var d1:Dikdortgen = Dikdortgen(5,10)

    println(d1.alanHesapla())

    var d2:Dikdortgen= Dikdortgen(4,12)
    println(d2.alanHesapla())

    var d3:Dikdortgen= Dikdortgen(boy = 12,en = 3)

    println(d3.alanHesapla())

    var d4:Dikdortgen= Dikdortgen()
    println(d4.alanHesapla())

    var en=5
    var d5:Dikdortgen= Dikdortgen(5)
    println("En değeri şöyledir: $en " +d5.alanHesapla())





}