package com.example.todoxml.ui.tasks

import androidx.lifecycle.ViewModel
import com.example.todoxml.data.TaskDao
import javax.inject.Inject

class TasksViewModel @Inject constructor(
    private val taskDao: TaskDao
): ViewModel() {
}