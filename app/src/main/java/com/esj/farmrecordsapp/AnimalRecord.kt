package com.esj.farmrecordsapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "animal_records_table")
data class AnimalRecord(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "operation")
    val operation: String,

    @ColumnInfo(name = "doer")
    val doer: String,

    @ColumnInfo(name = "image")
    val image: String,

    @ColumnInfo (name = "time")
    val time: Long)
