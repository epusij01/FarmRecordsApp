package com.esj.farmrecordsapp

import android.content.Context
import android.os.Build.VERSION
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized


//@Database(entities = [AnimalRecord::class], version = 1)
//abstract class AnimalRecordsDatabase : RoomDatabase() {
//
//    abstract val animalRecordsDao: AnimalRecordsDao
//
//    companion object {
//        @Volatile
//        private var INSTANCE: AnimalRecordsDatabase? = null
//
//        @OptIn(InternalCoroutinesApi::class)
//        fun getInstance(context: Context): AnimalRecordsDatabase {
//            synchronized(AnimalRecordsDatabase::class.java) {
//                var instance = INSTANCE
//                if (instance == null) {
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        AnimalRecordsDatabase::class.java,
//                        "animal_records_database"
//                    ).build()
//                    INSTANCE = instance
//                }
//                return instance
//            }
//        }
//    }
//}
@Database(entities = [AnimalRecord::class], version = 1)
abstract class AnimalRecordsDatabase : RoomDatabase() {

    abstract val animalRecordsDao : AnimalRecordsDao
    companion object{
        @Volatile
        private var INSTANCE : AnimalRecordsDatabase? = null

        @OptIn(InternalCoroutinesApi::class)
        fun getInstance(context: Context) : AnimalRecordsDatabase{
            synchronized(this){

                var instance = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(context.applicationContext,
                        AnimalRecordsDatabase::class.java, "animal_records_database").build()
                    INSTANCE = instance
                }
                return instance
            }
        }

    }

}