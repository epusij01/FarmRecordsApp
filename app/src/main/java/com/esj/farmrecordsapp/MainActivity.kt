package com.esj.farmrecordsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.esj.farmrecordsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var animalRecordsViewModel: AnimalRecordsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dao = AnimalRecordsDatabase.getInstance(application).animalRecordsDao
        val repository = AnimalRecordsRepository(dao)
        val factory = AnimalRecordsViewModelFactory(repository)
        animalRecordsViewModel = ViewModelProvider(this, factory)[AnimalRecordsViewModel::class.java]
        binding.farmRecordsViewModel = animalRecordsViewModel
        binding.lifecycleOwner = this
        displayFarmRecords()
    }

    private fun displayFarmRecords(){
        animalRecordsViewModel.records.observe(this, Observer {
            Log.i("MYTAG", it.toString())
        })

    }
}