package ru.mvlikhachev.mynotes.domain.usecases

import ru.mvlikhachev.mynotes.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}