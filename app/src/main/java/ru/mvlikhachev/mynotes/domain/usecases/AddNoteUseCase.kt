package ru.mvlikhachev.mynotes.domain.usecases

import ru.mvlikhachev.mynotes.domain.model.Note
import ru.mvlikhachev.mynotes.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.insertNote(note = note)
}