package Koleksiyonlar

import java.util.ArrayList

//mutablelistof veya arraylistof

fun main(args: Array<String>) {


    var degisebilenListe= ArrayList<Int>(50)
    var arrayListofListesi = arrayListOf("Hasan","mami",false,3,null)

    arrayListofListesi.add(5)
    arrayListofListesi.add("irem")
    arrayListofListesi.add(true)

    for (onakieleman in arrayListofListesi){

        println(onakieleman)
    }


    //günceleme

    arrayListofListesi.set(0,"yeni hasan")
    for (onakieleman in arrayListofListesi){

        println(onakieleman)
    }
    //sil

    arrayListofListesi.remove("yeni hasan")

    for (onakieleman in arrayListofListesi){

        println(onakieleman)
    }
        // indeks değerine göre silmek için
    arrayListofListesi.removeAt(0)
    for (onakieleman in arrayListofListesi){

        println(onakieleman)
    }
    println(arrayListofListesi.size)

}