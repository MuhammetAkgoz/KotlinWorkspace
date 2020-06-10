package UYGULAMALAR

fun main(args: Array<String>) {


    var dizi= Array<Int>(5){0}

    for (i in 0..dizi.size-1){
        println(""+(i+1)+".sayiyi giriniz: ")
        dizi[i] = readLine()!!.toInt()


    }

for (i in 0..dizi.size-1)
    println(dizi[i])


}