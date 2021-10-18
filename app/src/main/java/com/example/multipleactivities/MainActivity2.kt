package com.example.multipleactivities

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    lateinit var name: String
    lateinit var email: String
    lateinit var address: String
    lateinit var phone: String
    lateinit var info: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name=intent.getStringExtra("name").toString()
        email=intent.getStringExtra("email").toString()
        address=intent.getStringExtra("address").toString()
        phone=intent.getStringExtra("phone").toString()
        info=ArrayList()
        info.add(name)
        info.add(email)
        info.add(address)
        info.add(name)
        tvName.text= name
        tvEmail.text= email
        tvAddress.text= address
        tvPhone.text=phone

        btnConform.setOnClickListener {
            alertDialog()
        }


    }
    fun alertDialog(){

        val dialogBuild= AlertDialog.Builder(this)
        dialogBuild.setMessage("pleas click on agree ")

            .setPositiveButton("conform", DialogInterface.OnClickListener {
                    dialog, id ->
                val intent=Intent(applicationContext,MainActivity3::class.java)
                intent.putExtra("name",name)
                intent.putExtra("email",email)
                intent.putExtra("address",address)
                intent.putExtra("phone",phone)
                intent.putExtra("info",info)
                startActivity(intent)
            })
            .setNegativeButton("cancel", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        val aler=dialogBuild.create()
        aler.show()
    }
}