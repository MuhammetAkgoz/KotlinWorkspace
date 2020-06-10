package DataClassGetterSetter

class kisi(val id:Int,val isim:String){
    override fun toString(): String {
        return "id: $id   isim: $isim"
    }
}

fun main(args: Array<String>) {

    val emre=kisi(1,"Emre")
    val hasan=kisi(2,"Hasan")
    val emrekopya=emre

    println(emre.toString())
    println(emre.hashCode())
    println(emre.equals(hasan))
    println(emre.equals(emrekopya))
}