package com.example.kartisregistracia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var name : EditText
    private lateinit var lastname : EditText
    private lateinit var number : EditText
    private lateinit var cvv : EditText
    private lateinit var birth : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login (view: View){
        name = findViewById(R.id.name)
        lastname = findViewById(R.id.lastname)
        number = findViewById(R.id.number)
        cvv = findViewById(R.id.cvv)
        birth = findViewById(R.id.birth)
        if (name.length() ==0  ){
            Toast.makeText(this , "არასწორი სახელი", Toast.LENGTH_SHORT).show()
        }
        if (lastname.length() ==0  ){
            Toast.makeText(this , "არასწორი გვარი", Toast.LENGTH_SHORT).show()
        }
        if (number.length() != 16  ){
            Toast.makeText(this , "არასწორი ბარათის ნომერი", Toast.LENGTH_SHORT).show()
        }
        if (cvv.length() !=3  ){
            Toast.makeText(this , "არასწორი CVV ", Toast.LENGTH_SHORT).show()
        }
        if (birth.text.toString().toInt() <=1920 || birth.text.toString().toInt() >= 2004 || birth.length() != 4  ){
            Toast.makeText(this , "არასწორი დაბადების თარიღი", Toast.LENGTH_SHORT).show()
        }
        if (name.length() != 0 &&   lastname.length() != 0 && number.length() == 16 && cvv.length() == 3 && birth.text.toString().toInt() >= 1920 && birth.text.toString().toInt()
         <= 2004 && birth.length() == 4){
            Toast.makeText(this , "გილოცავთ , წარმატებით შეხვედით", Toast.LENGTH_SHORT).show()
            
        }
    }
}