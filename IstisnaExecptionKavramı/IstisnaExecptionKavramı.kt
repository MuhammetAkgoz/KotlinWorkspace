package IstisnaExecptionKavramı

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer
import java.lang.Exception

fun main(args: Array<String>) {

    var dizi=Array<Int>(3){0}

    dizi[0]=0
    dizi[1]=1
    dizi[2]=2

    try {
        istisna1(dizi)
    }catch (hatanesnesi:Exception){

        println(hatanesnesi.toString())
    }

    //exeption hatasından dolayı alt block çalılmadi
    println("main methodu sonlandı")

}

fun istisna1(dizi: Array<Int>) {
    println("İstisana 1 başldı")

    istisna2(dizi)

    println("İstisana 1 bitti")
}

fun istisna2(dizi: Array<Int>) {

    println("İstisna 2 başladı")

    for (i in 0..3)
        println("Sayi: " + dizi[i])

    println("İstisna 2 bitti.")
}
