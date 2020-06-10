package DizilerKavramı

import java.util.*

fun main(args: Array<String>) {


    var dizi1: Array<Int> = arrayOf(4,2,8,7,6)
    var dizi2= Array<Int>(5){0}


    System.arraycopy(dizi1,0,dizi2,0,5)


    for (i in 0.. dizi2.size-1)

        println(dizi2[i])

    Arrays.sort(dizi1)

    for (i in 0..dizi1.size-1)
    println(dizi1[i])


    println(Arrays.equals(dizi1,dizi2))


    var isimler = arrayListOf("Mami","Emre","Hasan")

    isimler.add("İrem")
    isimler.add(2,"Tuna")

    for (isim in isimler)

        println(isim)



    println(isimler.get(0))
    println(isimler.set(2,"Tuba"))
    isimler.remove("İrem")
    println("..........................")
    for (isim in isimler)

        println(isim)


}