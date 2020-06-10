package UYGULAMALAR

fun main(args: Array<String>) {

    println("Notunuzu giriniz: ")
    var not: Int= readLine()!!.toInt()


    if(not<45){
        println("HARF Notunuz: F ")
    }
    else if(not>=45 && not<55 ){
        println("HARF Notunuz: D")
    }
    else if(not>=55 && not<70 ){
        println("HARF Notunuz: C")
    }
    else if(not>=70 && not<85){
        println("HARF Notunuz: B")
    }
    else if(not>=85 && not<=100){
        println("HARF Notunuz: A")
    }


}