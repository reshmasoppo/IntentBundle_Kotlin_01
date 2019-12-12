package com.example.intentbundle_kotlin_01

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class Second :AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val username = bundle!!.get("userkey")
        val pass = bundle!!.get("passwordkey")

       // Toast.makeText(applicationContext,username.toString()+" "+pass,Toast.LENGTH_LONG).show()

        text_user.setText(username.toString())
        text_pass.setText(pass.toString())




    }

    fun back_action(v:View)
    {

        val intent:Intent=Intent(this,MainActivity::class.java)
        startActivity(intent)


    }


}