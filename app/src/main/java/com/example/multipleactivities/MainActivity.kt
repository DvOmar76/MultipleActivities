package com.example.multipleactivities

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSignUp.setOnClickListener {
            val name=edName.text.toString()
            val email=edEmail.text.toString()
            val address=edAddress.text.toString()
            val phone=edPhone.text.toString()
            val info=ArrayList<String>()
            info.add(name)
            info.add(email)
            info.add(address)
            info.add(phone)

            if (checkBox.isChecked){
                val intent=Intent(applicationContext,MainActivity2::class.java)
                intent.putExtra("name",name)
                intent.putExtra("email",email)
                intent.putExtra("address",address)
                intent.putExtra("phone",phone)
                startActivity(intent)
            }else{
                alertDialog()
            }

        }
    }

    fun alertDialog(){

        val dialogBuild=AlertDialog.Builder(this)
        dialogBuild.setMessage("pleas click on agree ")

            .setPositiveButton("ok", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        val aler=dialogBuild.create()
        aler.show()
    }
}