package UYGULAMALAR

fun main(args: Array<String>) {

    println("Bir Y değeri giriniz: ")
    var y: Int= readLine()!!.toInt()
    println("Bir X değeri giriniz: ")
    var x: Int= readLine()!!.toInt()



    if(x>0 && y<0) {
        var denk1 = 4 * x + 2 * y + 1
        println(denk1)
    }
    else if(x>0 && y==0) {
        var denk2 = 2 * x - y + 3
        println(denk2)
    }
    else if (x<0 && y>0) {
        var denk3 = 3 * x + 4 * y + 3
        println(denk3)
    }
    else{
        println("Bu değer aralığında  bir fonksiyon tanımlı değildir.")
        println("bkz:{NULL}")
        }



}