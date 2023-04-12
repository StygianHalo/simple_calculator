package com.example.experiment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1=findViewById<EditText>(R.id.number_1)
        val num2=findViewById<EditText>(R.id.number_2)

        val res=findViewById<TextView>(R.id.result)

        val add_btn=findViewById<Button>(R.id.Add_btn)
        val subBtn=findViewById<Button>(R.id.Sub_btn)
        val mulBtn=findViewById<Button>(R.id.Mul_btn)
        val divBtn=findViewById<Button>(R.id.div_btn)

        add_btn.setOnClickListener {
            var n1=num1.text.toString()
            var n2=num2.text.toString()
            var N1=n1.toFloat()
            var N2=n2.toFloat()

            var ans=N1+N2
            res.text=ans.toString()
        }

        subBtn.setOnClickListener {
            var n1=num1.text.toString()
            var n2=num2.text.toString()
            var N1=n1.toFloat()
            var N2=n2.toFloat()

            var ans=N1-N2
            res.text=ans.toString()
        }
        mulBtn.setOnClickListener {
            var n1=num1.text.toString()
            var n2=num2.text.toString()
            var N1=n1.toFloat()
            var N2=n2.toFloat()

            var ans=N1*N2
            res.text=ans.toString()
        }

        divBtn.setOnClickListener {
            var n1=num1.text.toString()
            var n2=num2.text.toString()
            var N1=n1.toFloat()
            var N2=n2.toFloat()

            var ans=N1/N2
            res.text=ans.toString()
        }
    }
}