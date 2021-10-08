package com.example.agecalculateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view: View) {

        //get current year
        val currentYear = Calendar.getInstance().get(Calendar.YEAR);

        //get user's birth year
        val etYear =  findViewById<EditText>(R.id.etYear);
        val birthYear = etYear.text.toString().toInt();

        //result
        val tvResult = findViewById<TextView>(R.id.tvAge);
        tvResult.text ="Age :" + (currentYear - birthYear);
    }
}