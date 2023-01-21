package ru.mvlikhachev.mynotes.domain.usecases

import ru.mvlikhachev.mynotes.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteByIdUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(id: Long) = noteRepository.getNoteById(id = id)
}