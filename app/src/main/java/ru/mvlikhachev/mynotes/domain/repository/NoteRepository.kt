package ru.mvlikhachev.mynotes.domain.repository

import ru.mvlikhachev.mynotes.data.local.dao.NoteRepositoryImpl
import ru.mvlikhachev.mynotes.domain.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteRepositoryImpl: NoteRepositoryImpl) {

    suspend fun getAllNotes(): List<Note> = noteRepositoryImpl.getAllNotes()
    suspend fun insertNote(note: Note) = noteRepositoryImpl.insertNote(note = note)
    suspend fun deleteNote(note: Note) = noteRepositoryImpl.deleteNote(note = note)
    suspend fun getNoteById(id: Long) = noteRepositoryImpl.getNoteById(nodeId = id)

}