package FonksiyonlarMethotlar

fun main(args: Array<String>) {

    println(Math.E)
    println(Math.PI)
    println(Math.abs(-2))//mutlak değere alır
    println(Math.ceil(8.9))// bir üst değere yuvarlar
    println(Math.floor(7.5))// bir alt sayiya yuvarlar

    println(Math.pow(2.0,5.0))

    println(Math.sqrt(81.0))

    println(Math.max(8.4,4.2))
    println(Math.min(8.3,8.1))


    println((Math.random()*100).toInt())//rastgele sayılar üretir


    //Dik kenarları x olan ikizkenar bir ücgenin alanını bulun

    var dikKenar: Double= readLine()!!.toDouble()

    var alan=(Math.pow(dikKenar,2.0))/2

    println(alan)


    var sayi1: Int = (Math.random()*50).toInt()
    var sayi2: Int= (Math.random()*50).toInt()


    println("Rastgele sayiların en büyüğü: "+ Math.max(sayi1,sayi2))
    println("Rastgele sayiların en küçüğü: "+ Math.min(sayi1,sayi2))


}