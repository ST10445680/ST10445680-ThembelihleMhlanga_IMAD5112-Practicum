package za.ac.iie.myweatherapplication_st10445680

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.viewmodel.CreationExtras


class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

    }

    val daysOfTheWeek = arrayOf("Monday\n","Tuesday\n","Wednesday\n","Thursday\n","Friday\n","Saturday\n","Sunday\n")
    val minimumTemp = arrayOf(20,21,23,24,26,19,22)
    val maximumTemp = arrayOf(29,31,30,33,35,28,27)
    val weatherCondition = arrayOf("Cloudy with a possibility of light rain later in the day\n","Cloudy overcast with rays of sunshine throughout the day\n","Mostly sunny with the possibility of a few clouds\n","Cloudy\n" ,"Sunny \n","Heavy rain with thunder is  to be expected\n","Sunny\n")
    val btnDetailedView  = findViewById<Button>(R.id.btnDetailedView)
    val btnExitApp = findViewById<Button>(R.id.btnExitApp)
    val btnClear = findViewById<Button>(R.id.btnClear)
    val listView1 = findViewById<ListView>(R.id.itemDaysOfTheWeekList)
    val listView2 = findViewById<ListView>(R.id.itemMinTemperature)
    val listView3 = findViewById<ListView>(R.id.itemMaxTemperature)
    val listView4 = findViewById<ListView>(R.id.itemWeatherCondition)
    val txtDisplayAvgMinTemp = findViewById<TextView>(R.id.txtDisplayAvgMinTemp_)
    val txtDisplayAvgMaxTemp = findViewById<TextView>(R.id.txtDisplayAvgMaxTemp)
    val txtInput = findViewById<TextView>(R.id.txtInput)
    val txtUserInput = findViewById<TextView>(R.id.txtUserInput)
    val txtErrorMessage = findViewById<TextView>(R.id.txtErrorMessage)


    val adapterDays  = ArrayAdapter(this, android.R.layout.simple_list_item_1, daysOfTheWeek)
    val adapterMin = ArrayAdapter(this, android.R.layout.simple_list_item_1, minimumTemp)
    val adapterMax = ArrayAdapter(this, android.R.layout.simple_list_item_1, maximumTemp)
    val adapterCondition = ArrayAdapter(this, android.R.layout.simple_list_item_1, weatherCondition)




    fun errorMessage(){

    }
        if (txtInput.isNullOrEmpty()) {
            println("I cannot provide you with a result unless you input a name of a city/region. Goodbye")
    }


    fun listviews(){

        listView1.adapter = adapterDays
        listView2.adapter = adapterMin
        listView3.adapter = adapterMax
        listView4.adapter = adapterCondition
    }




    fun avgMinTemp() {
        val numArray = minimumTemp
        var sum = 0.0

        for (num in numArray) {
            sum += num
        }

        val avgMinTemp = sum / numArray.size
        println("The average minimum temperature is:$txtDisplayAvgMinTemp %.2f".format(avgMinTemp)) //(www.programiz.com, n.d.)

    }


    fun avgMaxTemp(){

        val numArray = maximumTemp
        var sum = 0.0

        for (num in numArray) {
            sum += num
        }

        val avgMaxTemp = sum / numArray.size
        println("The average maximum temperature is:$txtDisplayAvgMaxTemp %.2f".format(avgMaxTemp)) //(www.programiz.com, n.d.)


    }

     fun proceedToDetailedView(){
         btnDetailedView.setOnClickListener {
             startActivity(Intent(this, DetailedViewScreen::class.java))//(includeMe,2012)
         }

     }

      fun exitApp(){
          btnExitApp.setOnClickListener {
              finish()
          }
      }

    fun  clearInput(){
        btnClear.setOnClickListener {

        }
    }








}