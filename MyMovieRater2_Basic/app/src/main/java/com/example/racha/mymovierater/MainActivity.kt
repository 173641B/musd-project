package com.example.racha.mymovierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun suitable(v:View?) {
            if (myCheckBox1.isChecked) {
                myCheckBox2.visibility = View.VISIBLE;
                myCheckBox3.visibility = View.VISIBLE;

            }else {
                myCheckBox2.visibility = View.INVISIBLE;
                myCheckBox3.visibility = View.INVISIBLE;
            }
    }



    fun addMovie (v:View?){
        var valid = true
        var title:String = moviename.text.toString()
        var overview: String = moviedesc.text.toString()
        var releasedate: String = date1.text.toString()

        var radioGroup = findViewById<RadioGroup>(R.id.radio)
        var selectedId:Int = radioGroup.checkedRadioButtonId

         var radioButton =findViewById<RadioButton>(selectedId)

       //var tablebox = findViewById<CheckBox>(R.id.myCheckBox1)
        var trhr:String
        var box2:String = ""
        var suitab:String
        if (myCheckBox1.isChecked){
            trhr = "false"
            suitab = "No"
            if (myCheckBox2.isChecked){
                box2 = myCheckBox2.text.toString()
                if (myCheckBox3.isChecked){
                    box2 += "\n" + myCheckBox3.text.toString()
                }
            }
             else if(myCheckBox3.isChecked) {
                box2 = myCheckBox3.text.toString()
            }
            else {
                myCheckBox2.setError("Select a reason")
                myCheckBox3.setError("Select a reason")
                valid = false
            }
        }
        else {
            trhr = "true"
            suitab = "Yes"
        }

        if (selectedId == -1){
            rbtnButton4.setError("Select lang")
            valid = false
        }



        if (title == ""){
            moviename.setError("Field Emptty")
            valid = false
        }
        if (overview == ""){
            moviedesc.setError("Field is Empty")
            valid = false
        }
        if (releasedate == ""){
            date1.setError("Field is empty")
            valid = false
        }
        if(valid){
            var display:String = "Title = " + title + "\n" + "Overview = "+ overview + "\n" + "Release Date = "  + releasedate + "\n" + "Language = " + radioButton.getText() +
            "\n" + "Suitable for all ages = " + trhr + "\n" + "Reason " + "\n" + box2
            Toast.makeText(this, display, Toast.LENGTH_LONG).show()
            viewing(moviename.text.toString(), moviedesc.text.toString(), date1.text.toString(),radioButton.text.toString(),suitab)
            var intent = Intent(this, Viewed::class.java)
            startActivity(intent)
        }



    }




}
