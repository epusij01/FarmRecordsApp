package com.esj.farmrecordsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class AnimalRecordsViewModelFactory(private val animalRecordsRepository: AnimalRecordsRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AnimalRecordsViewModel::class.java)){
            return AnimalRecordsViewModel(animalRecordsRepository) as T
        }
        throw IllegalArgumentException("Unknown Viewmodel class")
    }
}
