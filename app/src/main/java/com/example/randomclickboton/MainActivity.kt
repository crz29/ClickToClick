package com.example.randomclickboton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2: ImageView
    //lateinit indica al compilador de Kotlin que la variable se inicializará antes de que el código
    //llame a cualquier operación sobre ella

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2= findViewById(R.id.dice_image2)

        val bottomPress : Button = findViewById(R.id.bottom_press)
        bottomPress.setOnClickListener{RollDice()}

        //val textCambia : TextView = findViewById((R.id.text_random))
        //textCambia.text = "Numeros que cambian"
    }

    private fun RollDice() {

        Toast.makeText(this,"Numeros aleatorios", Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()
        val randomInt2= (1..6).random()
        //val textRandom : TextView =  findViewById(R.id.text_random)
        //textRandom.text = randomInt.toString()
        //se lo convierte a String porque el campo es Texto

        //val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawResource2 = when (randomInt2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawResource)
        diceImage2.setImageResource((drawResource2))

    }

}