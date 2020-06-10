package DataClassGetterSetter

class Kitap(private var id:Int,var isim:String,kitapRenk: kitapRenk){

    fun getid():Int{

        return id
    }

    fun setid(id:Int){

        if(id<0)
            this.id=1
        else
            this.id=id

    }
}
enum class kitapRenk{
    KIRMIZI,
    MAVİ,
    YESİL
}

fun main(args: Array<String>) {

    var k1:Kitap= Kitap(12,"Sefiller",kitapRenk.YESİL)

    println(k1.isim)
    k1.setid(-18)
    println(k1.getid())



}