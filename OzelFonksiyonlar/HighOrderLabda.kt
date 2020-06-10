package OzelFonksiyonlar

import DizilerKavramı.sayi
import javax.swing.Action

fun main(args: Array<String>) {

    var nesne:topla= topla()
    nesne.ikiSayiyiTopla(5,3)//normal yol

    /*var interfaceNesne=Test()

    //ANONİM İNNER SINIF KULLANMASAYDİK
    nesne.ikiSayiyiTopla(6,10,)*/

    nesne.ikiSayiyiTopla(6,10,object :ToplamGosteren{
        override fun toplamGosteren(topla: Int) {
            println(topla)//interface göstererek
        }


    })

    var lambdaExpresiion={ sayi:Int-> println(sayi)}// lamda expression, isimiz fonksiyon,sayi parametre->fonksiyon gövdesi gelir


    nesne.ikiSayiyiTopla(9,15,lambdaExpresiion)


}



class topla{

    fun ikiSayiyiTopla(a:Int,b:Int){
        var toplam= (a+b)
        println(toplam)
    }

    fun ikiSayiyiTopla(a:Int,b:Int, action: ToplamGosteren){
        val toplam= (a+b)
        action.toplamGosteren(toplam)
    }

    fun ikiSayiyiTopla(a:Int,b:Int,action:(Int)->Unit){

        val toplam= a+b
        action(toplam)


    }
}
interface ToplamGosteren{

    fun toplamGosteren(topla:Int)
}

class Test:ToplamGosteren{
    override fun toplamGosteren(topla: Int) {
        println(topla)
    }


}