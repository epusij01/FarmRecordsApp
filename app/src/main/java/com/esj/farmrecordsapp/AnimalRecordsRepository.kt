package com.esj.farmrecordsapp

class AnimalRecordsRepository(private val dao : AnimalRecordsDao) {

    val records = dao.getAllAnimalRecords()

    suspend fun insert(animalRecord: AnimalRecord){
        dao.insertRecord(animalRecord)
    }

    suspend fun update(animalRecord: AnimalRecord){
        dao.updateRecord(animalRecord)
    }

    suspend fun delete(animalRecord: AnimalRecord){
        dao.deleteRecord(animalRecord)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }
}