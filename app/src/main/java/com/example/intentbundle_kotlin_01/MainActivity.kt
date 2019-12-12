package com.example.intentbundle_kotlin_01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username:EditText= findViewById<EditText>(R.id.edit_username)
        var password:EditText=findViewById<EditText>(R.id.edit_password)


        button.setOnClickListener {

             var userdata:String= username.text.toString()
             var userpassword:String= password.text.toString()

            Toast.makeText(applicationContext, userdata+ " " +userpassword, Toast.LENGTH_LONG).show()

           val intent: Intent= Intent(this,Second::class.java)

            intent.putExtra("userkey",userdata)
            intent.putExtra("passwordkey",userpassword)
            startActivity(intent)


        }
     //Implicit intent

          /* intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/"))
          startActivity(intent)*/



    }
}
