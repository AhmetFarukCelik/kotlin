package com.example.farukelik

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var metin: String = "deneme"
        var Sayi: Int =  5
        var metin2: String = "lorem"
        var doublesayi:  Double = 0.0
        var sayi1 = 6
        var sayi3 = 3
        var Toplama = sayi1+sayi3
        var cikarma = sayi1-sayi3
        var carpma = sayi1*sayi3
        var bolme = sayi1/sayi3
        processfindtekcift()
        processIf()
        processwhen()
        processlist()
        processmultitypelist()

    }
    fun processfindtekcift(){
        var Listebir: ArrayList<Any> = arrayListOf()
        for (x in  0..10){
            Listebir.add(x)
        }
        for (z in 0..Listebir.size-1)
        {
            var check = z % 2
            when(check)
            {
                0 ->{
                    Log.i("çıktı", "çift" )
                }
                else ->{
                    Log.i("çıktı", "tek" )
                }

            }
        }


    }
    fun processIf(){
        val dersvarmi: Boolean = true
        if (dersvarmi){
            Toast.makeText( this,  "ders var", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText( this,  " daha ders var", Toast.LENGTH_LONG).show()
        }
    }
    fun processwhen(){
        var Sayi6 =4
        when (Sayi6){
            5 -> {
                Toast.makeText(this, "burası edu", Toast.LENGTH_SHORT).show()
            }
            7 -> {
                Toast.makeText(this, "burası edu", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(this, "burası edu", Toast.LENGTH_SHORT).show()
            }

        }

    }
    fun processlist(){//döngü
        var Liste: ArrayList<String> = arrayListOf()
        Liste.add( "ali")
        Liste.add("veli")
        Liste.add("hasan")
        Liste.add("hüseyin")
        Log.i("liste ilk eleman", Liste.first())
        Log.i("liste ilk eleman", Liste.last())
        Log.i("liste ilk eleman", Liste.size.toString())

        for (x in 0..100){
            Toast.makeText( this,Liste.get(x), Toast.LENGTH_SHORT).show()
            Toast.makeText( this,"Liste $x", Toast.LENGTH_SHORT).show()


        }
        for (x in 0..2) {
            Log.i("liste x", Liste.get(x))
        }
        Liste.forEach{
            Log.i("liste x", it)
        }
        var ListeSayilar: ArrayList<Int> = arrayListOf()
        for (i in 0..5){
            ListeSayilar.add(i)
        }

    }
    fun processmultitypelist(){
        var allTypeList: ArrayList<Any> = arrayListOf()//ArrayList<String>  ArrayList<Int>
        allTypeList.add("ahmet")
        allTypeList.add("0")
        allTypeList.add("0.0")
        var name = "FARUK CELİK"
        Log.i("liste string işlemleri",name.uppercase())
        Log.i("liste string işlemleri",name.lowercase())
        Log.i("liste string işlemleri",name.plus("deneme"))
        Log.i("liste string işlemleri",name.get(3).toString())
        Log.i("liste string işlemleri",name.substring(6,8))
        var splitname = name.split("").toTypedArray()
        Log.i("liste split",splitname.get(0)+"-----"+splitname.get(1))
        var namesplit= splitname.get(0).substring(0,1)
        var surnamesplit= splitname.get(1).substring(0,1)
        Log.i("liste adım ", namesplit+"****" )
        Log.i("liste soyadım ", namesplit+"****")}

    }






