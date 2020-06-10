package OzelFonksiyonlar

import java.math.BigInteger

fun main(args: Array<String>) {

    selamVer()
    println(normalFaktöriyel(BigInteger("70000")))
    println(recursiveFaktöriyel(BigInteger("70000")))


}

fun normalFaktöriyel(sayi:BigInteger):BigInteger{

    var sonuc=BigInteger.ONE
    for (i in 1..sayi.toInt())
        sonuc=sonuc*i.toBigInteger()

    return sonuc
}

tailrec fun recursiveFaktöriyel(sayi: BigInteger,sonuc:BigInteger=BigInteger.ONE):BigInteger{

    if (sayi==BigInteger.ZERO){
        return sonuc //BigInteger.ONE
    }else{

        return  recursiveFaktöriyel(sayi- BigInteger.ONE,sonuc*sayi)
    }

}


fun selamVer(){

    println("Merhaba")

}