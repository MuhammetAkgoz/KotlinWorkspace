package UYGULAMALAR

//10 elemanlı diziye eleman olarak dizi indexlerinin faktöriyelini atayan programı yaznınız

fun main(args: Array<String>) {

    var faktDizi= Array<Int>(10){0}



    var i=0
    while (i<=faktDizi.size-1){

        var toplam=1

        for (k in i downTo 1){
            toplam=toplam*k
        }

        faktDizi[i]=toplam
        i++
    }




    for (i in 0..faktDizi.size-1)
    println("$i.index-->"+faktDizi[i])

}