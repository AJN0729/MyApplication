package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.time.DayOfWeek

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorButton = findViewById<Button>(R.id.colorButton)

        colorButton.setOnClickListener {

            Toast.makeText(this, "Is Blue", Toast.LENGTH_SHORT).show()

        }


        val foodButton = findViewById<Button>(R.id.foodButton)

        foodButton.setOnClickListener {

            Toast.makeText(this, "Is Pizza", Toast.LENGTH_SHORT).show()


        }

        val bandButton = findViewById<Button>(R.id.bandButton)

        bandButton.setOnClickListener {

            Toast.makeText(this, "Is The Gorillaz", Toast.LENGTH_SHORT).show()


        }

        val dayOfWeekButton = findViewById<Button>(R.id.dayOfTheWeekButton)

        dayOfWeekButton.setOnClickListener {

            Toast.makeText(
                this,
                "Is Friday, Because I can sleep when I go home",
                Toast.LENGTH_SHORT
            ).show()


        }

        val holidayButton = findViewById<Button>(R.id.holidayButton)

        holidayButton.setOnClickListener {

            Toast.makeText(this, "Is Halloween", Toast.LENGTH_SHORT).show()


        }

        val thingToDoButton = findViewById<Button>(R.id.thingToDoButton)

        thingToDoButton.setOnClickListener {

            Toast.makeText(this, "Sleep/Calculus/Code", Toast.LENGTH_SHORT).show()


        }

    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.menu, menu)
            return true
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.actionAbout) {
            showInfo()
        }
        return true
    }

    private fun showInfo() {
        val dialogTitle = getString(R.string.aboutTitle, BuildConfig.VERSION_NAME)
        val dialogMessage = getString(R.string.aboutMessage)

        val builder = AlertDialog.Builder(this)
        builder.setTitle(dialogTitle)
        builder.setMessage(dialogMessage)
        builder.create().show()
    }



}