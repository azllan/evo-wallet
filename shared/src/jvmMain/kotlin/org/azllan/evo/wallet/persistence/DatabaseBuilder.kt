package org.azllan.evo.wallet.persistence

import androidx.room.Room
import androidx.room.RoomDatabase

import java.io.File

actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> {
    val databaseFile = File(System.getProperty("java.io.tmpdir"), "wallet.db")

    return Room.databaseBuilder<AppDatabase>(name = databaseFile.absolutePath)
}