package org.rajalakshmi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
   lateinit var ettext : EditText
   lateinit var bt1 : Button
   lateinit var tts: TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ettext = findViewById(R.id.ettext)
        bt1=findViewById(R.id.bt1)
        bt1.isEnabled=false
        tts= TextToSpeech(this,this)
        bt1.setOnClickListener{
            val text=ettext.text.toString()
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,"")
        }
    }

    override fun onInit(status: Int) {
        if(status==TextToSpeech.SUCCESS){
            var result= tts.setLanguage(Locale.US)
            if(result==TextToSpeech.LANG_MISSING_DATA||result == TextToSpeech.LANG_NOT_SUPPORTED)
            {

            }
            else
            {
                bt1.isEnabled=true
            }
        }
    }
}