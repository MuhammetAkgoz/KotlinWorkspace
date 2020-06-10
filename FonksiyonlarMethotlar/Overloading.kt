package FonksiyonlarMethotlar


fun main(args: Array<String>) {



    toplamınıBul(2,9)
    toplamınıBul(2,9,12)
    toplamlarınıGoster(1,2,4,5,6,7,34,9)
    var sayiDizisi: Array<Int> = arrayOf(1,23,5,8,7,44)
    toplamınıBul(sayiDizisi)
    toplamınıBul(4.2,4.6)
}

fun toplamınıBul(sayi1:Double,sayi2:Double) {

    println(sayi1+sayi2)

}

fun toplamınıBul(sayiDizisi: Array<Int>) {

    var toplam=0
    for(i in sayiDizisi){

        toplam=toplam+i

    }
    println(toplam)

}

fun toplamlarınıGoster(vararg sayilar:Int) {

    var toplam=0
    for (i in sayilar) {

     toplam=toplam+i

    }

    println(toplam)
}

fun toplamınıBul(sayi1: Int,sayi2:Int){

    println("TOPLAMI: "+(sayi1+sayi2))



}
fun toplamınıBul ( sayi1: Int,sayi2: Int,sayi3:Int){

    println("TOPLAMI: "+(sayi1+sayi2+sayi3))

}