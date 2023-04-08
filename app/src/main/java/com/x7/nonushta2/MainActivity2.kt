package com.x7.nonushta2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.nonushta2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent:Intent=getIntent()
        var image=intent.getIntExtra("image",0)
        var name=intent.getStringExtra("names")

        binding.imageviewactivity2.setImageResource(image)
        binding.textviewactivity2.text=name


    }
}