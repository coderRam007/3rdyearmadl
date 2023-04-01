package org.rajalakshmi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name:EditText=findViewById(R.id.name)
        val cgpa:EditText=findViewById(R.id.cgpa)
        val save: Button =findViewById(R.id.save)
        val load: Button =findViewById(R.id.load)
        save.setOnClickListener{
            val Name= name.text.toString()
            val Cgpa=cgpa.text.toString()
            val file= File(getExternalFilesDir(null),"student.txt")
            val write
        }
    }
}