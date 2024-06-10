package za.ac.iie.myweatherapplication_st10445680

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val welcomeMessage = findViewById<EditText>(R.id.editTextWelcomeToApplication)
    val editTextStudentName = findViewById<EditText>(R.id.editTextStudentName)
    val editTextStudentNumber = findViewById<EditText>(R.id.editTextStudentNumber)
    val txtCreatedby= findViewById<TextView>(R.id.txtCreatedby)
    val imgWeatherIcon =findViewById<ImageView>(R.id.imgWeatherIcon)
    val btnExitApplication = findViewById<Button>(R.id.btnExitApp)
    val btnMainScreen = findViewById<Button>(R.id.btnMainScreen)


    fun exitApplication(){
         btnExitApplication.setOnClickListener {
             finish()
         }
    }

    fun proceedToMainScreen(){
        btnMainScreen.setOnClickListener {
            startActivity(Intent(this, MainScreen::class.java))//(includeMe,2012)
        }
    }


}