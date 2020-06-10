package DosyaIslemleri

import java.io.FileReader
import java.lang.Exception

fun main(args: Array<String>) {

        var dosya:FileReader?= null
    try {
        var dosya=FileReader("ilkdosya.txt")

        var okunanVeri:Int=0
        //do { }
         while(okunanVeri != -1){

             print(okunanVeri.toChar())
             okunanVeri=dosya.read()
         }




    }catch (istisna:Exception)
    {
        println(istisna.toString())
    }finally {
        dosya?.close()
    }

    var dosya2= FileReader("ilkdosya.txt")

    println("\nfor echline ile ile okuma")
    dosya2.forEachLine {

        println(it)
    }
}