package UYGULAMALAR

fun main(args: Array<String>) {

    var toplam=0
    println("Kaç elemanlı dizi olsun")
    var diziSayisi: Int= readLine()!!.toInt()

    var dizi1= Array<Int>(diziSayisi){0}

    for (i in 0..dizi1.size-1){
        println(""+(i+1)+".Elemanı giriniz: ")
        dizi1[i]= readLine()!!.toInt()


    }

    for (i in 0..dizi1.size-1){

        toplam=toplam+dizi1[i]

    }

    println("Dizinin toplamı: "+toplam)

}