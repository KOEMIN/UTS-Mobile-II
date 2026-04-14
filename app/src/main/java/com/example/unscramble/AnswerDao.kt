package com.example.unscramble

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.unscramble.data.UserAnswer
import kotlinx.coroutines.flow.Flow


interface AnswerDao {
    @Insert

    suspend fun insertWord(word: UserAnswer)

    @Query("SELECT * FROM correct_answers ORDER by id DESC")
    fun getALLanswers(): Flow<List<UserAnswer>>

    @Query("DELETE FROM correct_answers")
    suspend fun deleteAll()
}