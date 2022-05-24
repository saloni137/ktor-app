package com.example.services

import com.example.models.Train
import com.example.respositories.TrainRepository

class TrainService(){
    private val trainRepository: TrainRepository = TrainRepository();
    suspend fun create(train: Train): Train {
        return trainRepository.create(train)
    }

    suspend fun list(): MutableList<Train> {
        return trainRepository.list()
    }
}