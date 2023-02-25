package org.rajalakshmi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etFirstNo:EditText=findViewById(R.id.etFirstNo)
        val etSecondNo:EditText=findViewById(R.id.etsecondNo)
        val etResult:EditText=findViewById(R.id.etresult)
        val btAdd:Button=findViewById(R.id.btAdd)
        val btSub:Button=findViewById(R.id.btSub)
        val btMul:Button=findViewById(R.id.btMul)
        val btDiv:Button=findViewById(R.id.btDiv)
        val btMod:Button=findViewById(R.id.btMod)
        btAdd.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            var SecondNo=etSecondNo.text.toString().toInt()
            etResult.setText((firstNo+SecondNo).toString())
        }
        btSub.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            var SecondNo=etSecondNo.text.toString().toInt()
            etResult.setText((firstNo-SecondNo).toString())
        }
        btDiv.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            var SecondNo=etSecondNo.text.toString().toInt()
            etResult.setText((firstNo/SecondNo).toString())
        }
        btMul.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            var SecondNo=etSecondNo.text.toString().toInt()
            etResult.setText((firstNo*SecondNo).toString())
        }
        btMod.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            var SecondNo=etSecondNo.text.toString().toInt()
            etResult.setText((firstNo%SecondNo).toString())
        }

    }
}