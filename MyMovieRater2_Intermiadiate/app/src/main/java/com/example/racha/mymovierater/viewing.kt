package com.example.racha.mymovierater

class viewing(title: String, desc:String, checkedRadio:String, relDate:String, suit:String, ratingOnly:Float, review:String) {
    var title:String
    var desc:String
    var checkedRadio:String
    var relDate:String
    var suit:String
    var ratingOnly:Float
    var review:String

    init {
        this.title = title
        this.desc = desc
        this.checkedRadio = checkedRadio
        this.relDate = relDate
        this.suit = suit
        this.ratingOnly = ratingOnly
        this.review = review
    }
}
var view = viewing("", "", "", "", "", -1f,"")

