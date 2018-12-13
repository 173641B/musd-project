package com.example.racha.mymovierater

open class viewing(title: String, desc:String, relDate:String, checkedRadio:String, suit:String) {
    var title:String
    var desc:String
    var relDate:String
    var checkedRadio:String
    var suit:String

    init {
        this.title = title
        this.desc = desc
        this.relDate = relDate
        this.checkedRadio = checkedRadio
        this.suit = suit
    }
}