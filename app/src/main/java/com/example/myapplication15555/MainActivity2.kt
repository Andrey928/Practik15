package com.example.myapplication15555

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView = findViewById<TextView>(R.id.textView)
        var animal:Animal = Animal()
        val arguments:Bundle? = intent.extras
        if (arguments != null){
            animal = arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal
            textView.text = "Ваша порода:   ${animal.getPoroda()}\n год и месяц рождения:   ${animal.getGodimecag()}"
        }
    }
}