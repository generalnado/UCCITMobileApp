package com.gennard.myucc_it

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //Gets value sent from Directory activity
        val index: String? = this.intent.getStringExtra("listIndex")

        //Creates objects for each activity element
        val name: TextView = findViewById(R.id.tvName)
        val number: TextView = findViewById(R.id.tvNumber)
        val email: TextView = findViewById(R.id.tvEmail)
        val photo: ImageView = findViewById(R.id.ivProfile)

        //Assigns value to elements according to retrieved index
        when (index) {
            "0" -> {
                name.text = "ROSE, Natalie"
                number.text = "(876)339-0961"
                email.text = "ithod@ucc.edu.jm"
                photo.setImageResource(R.drawable.rose)
            }

            "1" -> {
                name.text = "OSBOURNE, Otis"
                number.text = "(876)906-3000"
                email.text = "itfaculty@ucc.edu.jm"
                photo.setImageResource(R.drawable.osbourne)
            }

            "2" -> {
                name.text = "NDAJAH, Peter"
                number.text = "(876)906-3000"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                photo.setImageResource(R.drawable.ndajah)
            }

            "3" -> {
                name.text = "REID, Pamella"
                number.text = "(876)236-1895"
                email.text = "itprogrammeofficer2@ucc.edu.jm"
                photo.setImageResource(R.drawable.reid)
            }

            "4" -> {
                name.text = "WILMOT, Craig"
                number.text = "(876)548-0629"
                email.text = "itprogofficer4@ucc.edu.jm"
                photo.setImageResource(R.drawable.wilmot)
            }
        }

        //Launches email client when email address is tapped
        email.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", email.toString(), null))
            intent.putExtra(Intent.EXTRA_EMAIL, email.toString())
            startActivity(intent)
        }
    }
}


