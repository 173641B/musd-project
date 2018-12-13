package com.example.racha.mymovierater

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rating.*
import kotlinx.android.synthetic.main.viewing.*
import kotlinx.android.synthetic.main.viewing.view.*

class ViewingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewing)

        var  review = findViewById<TextView>(R.id.reviewtext)

        registerForContextMenu(review)



        titleText.text = view.title
        overviewtext.text = view.desc
        languagetext.text = view.checkedRadio
        datetext.text = view.relDate
        agetext.text = view.suit
        reviewmore.text = view.review
        if(view.ratingOnly != -1f){
            reviewtext.visibility = View.GONE
            ratingonly.visibility = View.VISIBLE
            reviewmore.visibility = View.VISIBLE
            ratingonly.rating = view.ratingOnly
        }
    }




    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {

        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menuforreview, menu)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.review -> {
                var intent = Intent(this, rating::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}