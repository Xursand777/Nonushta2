package com.x7.nonushta2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.nonushta2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        supportFragmentManager.beginTransaction().replace(R.id.linearlay1,Home()).commit()
        binding.bottomnavigationview1.getMenu().findItem(R.id.item2).setChecked(true)

        binding.bottomnavigationview1.setOnItemSelectedListener {

            when(it.itemId){
                R.id.item1->{
                    supportFragmentManager.beginTransaction().replace(R.id.linearlay1,Category()).commit()
                }
                R.id.item2->{
                    supportFragmentManager.beginTransaction().replace(R.id.linearlay1,Home()).commit()
                }
                R.id.item3->{
                    supportFragmentManager.beginTransaction().replace(R.id.linearlay1,Favorite()).commit()
                }
            }


            return@setOnItemSelectedListener true
        }


    }

    override fun onBackPressed() {

        supportFragmentManager.beginTransaction().replace(R.id.linearlay1,Category()).commit()

    }
}