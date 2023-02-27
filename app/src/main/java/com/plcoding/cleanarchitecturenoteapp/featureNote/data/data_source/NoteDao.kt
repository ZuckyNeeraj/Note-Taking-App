package com.plcoding.cleanarchitecturenoteapp.featureNote.data.data_source

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    //this will display all the notes from database
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>



    //this will return note by id
    @Query("SELECT * FROM note WHERE id= :id")
    suspend fun getNoteById(id: Int): Note?

    //in case of insertion of already existing note it will just update the old note
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    //this will delete the particular note
    @Delete
    suspend fun deleteNote(note: Note)
}