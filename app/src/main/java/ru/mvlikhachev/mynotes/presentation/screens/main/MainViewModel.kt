package ru.mvlikhachev.mynotes.presentation.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.mvlikhachev.mynotes.domain.model.Note
import ru.mvlikhachev.mynotes.domain.usecases.GetAllNotesUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllNotesUseCase: GetAllNotesUseCase
) : ViewModel() {
    private val _notes = MutableLiveData<List<Note>>()
    val notes: LiveData<List<Note>>
        get() = _notes

    init {
        getAllNotes()
    }

    fun getAllNotes() {
        viewModelScope.launch {
            getAllNotesUseCase.invoke().let {
                _notes.postValue(it)
            }
        }
    }
}