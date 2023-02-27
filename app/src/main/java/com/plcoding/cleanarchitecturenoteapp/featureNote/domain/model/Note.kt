package com.plcoding.cleanarchitecturenoteapp.featureNote.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*

//We are making the schema of our app
@Entity
data class Note(
    val title: String,
    val content: Long,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        //this will have bunch of colors that we are going to use in our app
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
