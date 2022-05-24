package com.example.respositories

import com.example.models.Train

class TrainRepository {
    private val trainCollection = mutableListOf<Train>()

    suspend fun create(train: Train): Train {
        trainCollection.add(train)
        return train
    }

    suspend fun list(): MutableList<Train> {
        return trainCollection
    }

}