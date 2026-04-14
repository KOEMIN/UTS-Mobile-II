package com.example.unscramble.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("correct_answers")
data class UserAnswer(
    @PrimaryKey (autoGenerate = true)
    val id: Int = 0,
    val answer: String
)