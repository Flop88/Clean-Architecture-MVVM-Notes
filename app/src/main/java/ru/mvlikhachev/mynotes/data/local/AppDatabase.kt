package ru.mvlikhachev.mynotes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.mvlikhachev.mynotes.data.local.dao.NoteRepositoryImpl
import ru.mvlikhachev.mynotes.domain.model.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteRepositoryImpl
}