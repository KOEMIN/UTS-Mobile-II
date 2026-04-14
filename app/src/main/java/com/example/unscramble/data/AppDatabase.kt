package com.example.unscramble.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unscramble.AnswerDao

@Database(entities = [UserAnswer::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun AnswerDao(): AnswerDao
}