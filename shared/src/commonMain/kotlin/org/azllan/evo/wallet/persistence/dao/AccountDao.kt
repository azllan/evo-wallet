package org.azllan.evo.wallet.persistence.dao

import org.azllan.evo.wallet.persistence.mappers.AccountMapper

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AccountDao {
    @Query("SELECT * FROM accounts")
    fun getAllAccounts(): Flow<List<AccountMapper>>
}