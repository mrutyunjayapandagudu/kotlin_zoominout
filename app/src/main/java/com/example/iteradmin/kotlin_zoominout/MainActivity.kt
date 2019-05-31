package com.example.iteradmin.kotlin_zoominout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img=findViewById<ImageView>(R.id.image)
        val bt1=findViewById<Button>(R.id.button)
        val zoomin=findViewById<Button>(R.id.button2)
        val zoomout=findViewById<Button>(R.id.button3)
           val im= arrayOf("https://www.pexels.com/photo/bloom-blooming-blossom-blur-462118/")
        zoomin.setOnClickListener{
            val x:Float=img.scaleX
            val y:Float=img.scaleY
            img.scaleX=x+1
            img.scaleY=y+1
        }
        zoomout.setOnClickListener{
            val x:Float=img.scaleX
            val y:Float=img.scaleY
            img.scaleX=x+1
            img.scaleY=y+1
        }
        var i:Int=0
        val n:Int=im.size
        bt1.setOnClickListener(){
            Glide.with(this).load(im[0]).into(img)
        }
    }
}
