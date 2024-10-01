package org.azllan.evo.wallet.persistence.mappers

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts")
data class AccountMapper(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
)