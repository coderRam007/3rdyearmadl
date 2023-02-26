package org.rajalakshmi.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math

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
        val btsin:Button=findViewById(R.id.btsin)
        val btcos:Button=findViewById(R.id.btcos)
        val bttan:Button=findViewById(R.id.bttan)
        val btlog:Button=findViewById(R.id.btlog)
        val btsqrt:Button=findViewById(R.id.btsqrt)
        val btpow:Button=findViewById(R.id.btpow)
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
        btsin.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            etResult.setText(Math.sin(firstNo.toDouble()).toString())
        }
        btcos.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            etResult.setText(Math.cos(firstNo.toDouble()).toString())
        }
        bttan.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            etResult.setText(Math.tan(firstNo.toDouble()).toString())
        }
        btlog.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            etResult.setText(Math.log10(firstNo.toDouble()).toString())
        }
        btsqrt.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            etResult.setText(Math.sqrt(firstNo.toDouble()).toString())
        }
        btpow.setOnClickListener(){
            var firstNo=etFirstNo.text.toString().toInt()
            var secondNo=etSecondNo.text.toString().toInt()
            etResult.setText(Math.pow(firstNo.toDouble(),secondNo.toDouble()).toString())
        }
    }
}