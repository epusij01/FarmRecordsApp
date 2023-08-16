package com.esj.farmrecordsapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


@Dao
interface AnimalRecordsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertRecord(animalRecord: AnimalRecord){}

    @Update
    suspend fun updateRecord(animalRecord: AnimalRecord){

    }

    @Delete
    suspend fun deleteRecord(animalRecord: AnimalRecord){

    }

    @Query("DELETE  FROM  animal_records_table")
    suspend fun deleteAll()

     @Query("SELECT * FROM animal_records_table")
    fun getAllAnimalRecords(): LiveData<List<AnimalRecord>>
}