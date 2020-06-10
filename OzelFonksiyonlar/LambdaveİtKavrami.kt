package OzelFonksiyonlar

class TestLambda{

    fun ikiSayiyiTopla(sayi1:Int,sayi2:Int,action:(Int,Int)->Int){
        val toplam=action(sayi1,sayi2)
        println(toplam)
    }
    fun terystenYaz(yazi:String,myFunc:(String)->String){
        var terstenYazi=myFunc(yazi)
        println(terstenYazi)

    }
}

fun main(args: Array<String>) {
    var nesne=TestLambda()
    var lambdafonk={a:Int,b:Int->a+b}
    nesne.ikiSayiyiTopla(9,12,lambdafonk)
    nesne.ikiSayiyiTopla(9,12,{a:Int,b:Int->a+b})
    nesne.ikiSayiyiTopla(9,12,lambdafonk)

    var lambdaFonkSTR={yazi:String->yazi.reversed()}

    nesne.terystenYaz("merhaba",lambdaFonkSTR)
    nesne.terystenYaz("merhaba",{yazi:String->yazi.reversed()})
    nesne.terystenYaz("merhaba"){it.reversed()}

}