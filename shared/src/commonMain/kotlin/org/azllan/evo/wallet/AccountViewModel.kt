package org.azllan.evo.wallet

import org.azllan.evo.wallet.persistence.AccountRepository
import org.azllan.evo.wallet.persistence.mappers.AccountMapper

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import org.azllan.evo.wallet.persistence.getDatabaseBuilder
import org.azllan.evo.wallet.persistence.getRoomDatabase

class AccountViewModel: ViewModel() {
    private val accountRepository = AccountRepository(getRoomDatabase(getDatabaseBuilder()))

    val accountListState: StateFlow<AccountListState> = accountRepository.listAccounts().map {
        AccountListState(it)
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000L),
        initialValue = AccountListState()
    )
}

data class AccountListState(
    val accounts: List<AccountMapper> = listOf()
)