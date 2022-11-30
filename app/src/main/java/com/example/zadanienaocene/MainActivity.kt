package com.example.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

//Kacper Michalak 2pr
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val silniaRun = findViewById<Button>(R.id.Silniarun)
        val silniaInput = findViewById<EditText>(R.id.Silnia)

        silniaRun.setOnClickListener{
            val inputint = silniaInput.text.toString().toInt()
            var silniaResult=1
            if(inputint>10){
                findViewById<TextView>(R.id.SilniaOut).text=("Podaj liczbe mniejszą od lub równą 10")
            }
            else{
                if(inputint==0 || inputint==1){
                    silniaResult=1
                }
                else{
                    for(i in 2 .. inputint)
                        silniaResult *= i
                }
                val text=silniaResult.toString()
                findViewById<TextView>(R.id.SilniaOut).text=(text)
            }
        }
        val image = findViewById<ImageView>(R.id.image)
        val images = arrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)
        findViewById<Button>(R.id.Blewo).setOnClickListener() {
            if (image.drawable.constantState == resources.getDrawable(images[0]).constantState) {
                image.setImageResource(images[2])
            } else if (image.drawable.constantState == resources.getDrawable(images[1]).constantState) {
                image.setImageResource(images[0])
            } else if (image.drawable.constantState == resources.getDrawable(images[2]).constantState) {
                image.setImageResource(images[1])
            }
        }
        findViewById<Button>(R.id.Bprawo).setOnClickListener() {
            if (image.drawable.constantState == resources.getDrawable(images[0]).constantState) {
                image.setImageResource(images[1])
            } else if (image.drawable.constantState == resources.getDrawable(images[1]).constantState) {
                image.setImageResource(images[2])
            } else if (image.drawable.constantState == resources.getDrawable(images[2]).constantState) {
                image.setImageResource(images[0])
            }
        }

    }
}