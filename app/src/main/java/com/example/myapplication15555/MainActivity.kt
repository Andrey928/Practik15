package com.example.myapplication15555

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(){
            val poroda = editText.text.toString()
            val godimecag = editText2.text.toString().toIntOrNull()

            if (poroda.isNotEmpty() && godimecag != null) { // Check if both fields are filled
                val animal = Animal(poroda, godimecag)
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(animal.javaClass.simpleName, animal)
                startActivity(intent)
            } else {
                // Handle invalid input (e.g., show an error message)
                Toast.makeText(this, "Введите данные о породе и годе рождения", Toast.LENGTH_SHORT).show()
            }

    }
}
}
