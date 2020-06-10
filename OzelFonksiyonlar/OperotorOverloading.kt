package OzelFonksiyonlar

class Baslik(var deger:String)


fun main(args: Array<String>) {

    var isim="emre"
    var soyisim=" Altundaşar"

    var tamad=isim+soyisim

    println(tamad)

    var tamad2=isim.plus(soyisim)

    println(tamad2)

    val b1=Baslik("baslik 1")
    val b2=Baslik("baslik 2")

    val b3=b1.plus(b2)
    val b4=b1 plus b2
    var b5=b1 + b2
    println(b3.deger)
    println(b4.deger)


}

operator infix fun Baslik.plus(b2:Baslik):Baslik{

    var gecicibaslik:Baslik= Baslik(this.deger+ " " + b2.deger)
    return gecicibaslik

}