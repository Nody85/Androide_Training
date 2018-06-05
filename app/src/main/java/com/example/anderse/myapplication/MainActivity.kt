package com.example.anderse.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            toastMe(it)
        }

        button2.setOnClickListener{
            countMe(it)
        }
        button3.setOnClickListener{
            openrandom()
        }
    }

    private fun openrandom() {
        val intent = Intent(this, RandomActivity::class.java)
        // Start the new activity.
        val countString = textView4.text.toString()
        var count: Int = Integer.parseInt(countString)
        intent.putExtra(RandomActivity.TOTAL_COUNT,count)
        startActivity(intent)
    }

    private fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    private fun countMe(view: View) {
        // Get the text view
        //val showCountTextView = findViewById(R.id.textView4) as TextView
        val countString = textView4.text.toString()
        // Get the value of the text view.
        //val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        textView4.text = count.toString();
    }
}
