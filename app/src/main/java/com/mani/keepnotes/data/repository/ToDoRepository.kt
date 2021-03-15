package com.mani.keepnotes.data.repository

import androidx.lifecycle.LiveData
import com.mani.keepnotes.data.models.ToDoDao
import com.mani.keepnotes.data.models.ToDoData

class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData){
        toDoDao.insertData(toDoData)
    }
}