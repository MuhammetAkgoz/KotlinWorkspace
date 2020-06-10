package CepTelefonuUygulaması

class Kisi(var isim:String,var telNo:String) {

    companion object{
        fun kisiOLustur(isim:String,telNo:String):Kisi{

            return Kisi(isim,telNo)
        }

    }


}