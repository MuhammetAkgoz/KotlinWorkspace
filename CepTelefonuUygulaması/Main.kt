package CepTelefonuUygulaması

import FonksiyonlarMethotlar.isimYazdır
import java.util.*

private val tara=Scanner(System.`in`)
private val cepTelefonum =CepTelefonu("555-55-55")

fun main(args: Array<String>) {

    telefonBaslat()
    menuGöster()


    var cikis:Boolean=false

    while (!cikis){

        println("SEÇİMİNİZ: (Menüyü görmek için 6ya basınız)")

        var seçim= tara.nextInt()
        when(seçim){
           0->{
               println("Çıkış yapılıyor...")
               cikis=true
           }
           1->{
               cepTelefonum.listele()

           }
           2->{
               yeniKisiEkleFonksiyonu()
           }
           3->{
                kisiSorgulamaMethodu()

           }
           4->{
               kisiSilmeMethodu()

           }
           5->{
                kisiGunceleFonksiyonu()
           }
           6->{
               menuGöster()
           }
           else -> println("Yanlış bir seçim yaptınız, tekrardan bir sayi giriniz.")
        }


    }

}

fun kisiSilmeMethodu() {
    println("Silinecek kişinin adını yazınız")

    val isim= tara.next()
    val bulunanKisi= cepTelefonum.kisiSorgula(isim)
    if(bulunanKisi != null)
    {
        if (cepTelefonum.kisiSil(bulunanKisi!!)){
            println("kisi silindi")
            }
    }
    else{
        println("Kisi yok")
        }
}

fun kisiSorgulamaMethodu() {
    println("Aranacak kişinin adını giriniz:")

    val isim= tara.next()

    val bulunanKisi=cepTelefonum.kisiSorgula(isim)
    if (bulunanKisi==null){
        println("Rehberde böyle birisi yok")
    }
    else
        println("Bulunan Kisi: ${bulunanKisi.isim}---${bulunanKisi.telNo}")
}

fun kisileriListele() {

}

fun yeniKisiEkleFonksiyonu() {
    println("Kişinin ismini giriniz: ")
    val isim= tara.next()

    println("Kisinin numarısını giriniz: ")
    val numara= tara.next()

    cepTelefonum.ekleYeniKisi(Kisi.kisiOLustur(isim,numara))
}

fun kisiGunceleFonksiyonu(){
    println("Güncelenecek kisişinin ismini giriniz:")

    val isim= tara.next()

    val eskiKisi= cepTelefonum.kisiSorgula(isim)

    if (eskiKisi == null)
    {
        println("Kayıt bulunamadı")
        return
    }
    println("Yeni adı giriniz:")
    val yeniisim= tara.next()

    println("yeni numarısını giriniz: ")
    val yeninumara= tara.next()
    cepTelefonum.kisiGuncele(eskiKisi ,Kisi.kisiOLustur(yeniisim,yeninumara))

}

fun menuGöster() {
    println("***************MENU****************")
    println("0--Çıkış\n" +
            "1--Tüm kişileri listele\n"+
            "2--Yeni Kişi ekle\n" +
            "3--Kişi sorgula\n" +
            "4--Kişi sil\n" +
            "5--Kişi güncele\n" +
            "6--Menü göster\n")

}

fun telefonBaslat() {

    println("Telefon başlatılıyor..\n\n")
}
