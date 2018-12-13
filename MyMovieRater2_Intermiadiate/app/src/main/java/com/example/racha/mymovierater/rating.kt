package com.example.racha.mymovierater

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.racha.mymovierater.viewing
import kotlinx.android.synthetic.main.activity_rating.*
import kotlinx.android.synthetic.main.viewing.*
import kotlinx.android.synthetic.main.viewing.view.*


class rating : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.submit, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.submit) {
            var reviewStars = rate.rating
            var reviewMore: String = shareview.text.toString()
            var realMovie = reviewMore + reviewStars
            view.review = reviewMore
            view.ratingOnly = reviewStars
            Toast.makeText(this, realMovie, Toast.LENGTH_LONG).show()
            var intent = Intent(this, ViewingActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}