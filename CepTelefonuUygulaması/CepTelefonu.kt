package CepTelefonuUygulaması

class CepTelefonu( val KendiNumaram: String) {

    private val rehber : ArrayList<Kisi>

    init {
        this.rehber= ArrayList()
    }

    fun ekleYeniKisi(yenikisi:Kisi):Boolean{

        if(kisiBul(yenikisi.isim) >=0){
            println("${yenikisi.isim} zaten rehberde kayıtlı.")
            return false
        }

        this.rehber.add(yenikisi)
        println("Kisi başarılı bir şekilde eklenmiştir.")
        return true
    }
    fun kisiBul(aranacakKisi: Kisi):Int {

         return this.rehber.indexOf(aranacakKisi)

    }
    fun kisiBul(isim:String):Int{

        for (i: Int in rehber.indices){

            val  oankikisi=rehber[i]

            if (oankikisi.isim.equals(isim))
                return i
        }
        return -1
    }
    fun listele(){

        if (rehber.size==0){
            println("Kayıtlı isim yoktur.")
            return
        }
        for (oankiisi: Kisi in rehber){
            println("*${oankiisi.isim}----${oankiisi.telNo}")
        }
    }
    fun kisiSorgula(isim:String):Kisi?{
        val position=kisiBul(isim)

        return if (position >=0){
            rehber[position]
        } else null
    }
    fun kisiSil(silincekKisi:Kisi) :Boolean{

       val position= kisiBul(silincekKisi)
        if (position<0){
            println("Rehberde böyle biri yok")
            return false
        }
         this.rehber.remove(silincekKisi)
            println("Kisi silindi.")
        return true
    }
    fun kisiGuncele(eskiKisi: Kisi,yenikisi: Kisi): Boolean{

        val bulunanPossion=kisiBul(eskiKisi)
        if (bulunanPossion<0){
            println("Böyle birisi yoktur")
            return false
        }
        rehber[bulunanPossion]= yenikisi
        println("${eskiKisi.isim} kişisi ${yenikisi.isim} ile güncelenmiştir.")
        return true
    }


}