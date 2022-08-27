package com.example.androidchallenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var editText : EditText
    private lateinit var textView : TextView
    private lateinit var radioAmazing : RadioButton
    private lateinit var radioGood : RadioButton
    private lateinit var radioOk : RadioButton
    private lateinit var switch : Switch
    private lateinit var btnCalculate : Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        textView = findViewById((R.id.serviceText))
        radioAmazing = findViewById(R.id.radioAmazing)
        radioGood = findViewById(R.id.radioGood)
        radioOk = findViewById(R.id.radioOk)
        switch = findViewById(R.id.switchTip)
        btnCalculate = findViewById(R.id.btnCalculate)
    }
}