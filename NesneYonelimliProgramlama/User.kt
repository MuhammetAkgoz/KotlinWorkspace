package NesneYonelimliProgramlama

class User(var yas:Int,var isim:String) {

    var adres:String=""

    init {

        if (yas<0) {
            yas=1
        }

        println("İsim: "+isim+"\n"+"Yas: "+yas)
    }
    constructor(yas: Int,isim: String,adres:String):this(yas,isim){

    this.adres=adres

    }

}

fun main(args: Array<String>) {

    var Emre:User = User(-5,"Emre")
    var Mami:User = User(19,"Mami")
    var Ali:User = User(21,"Ali","İstanbul")


}