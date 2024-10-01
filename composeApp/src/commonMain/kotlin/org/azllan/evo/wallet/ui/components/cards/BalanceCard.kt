package org.azllan.evo.wallet.ui.components.cards

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.Color
import org.azllan.evo.wallet.AccountViewModel

@Composable
fun BalanceCard() {
    Card {
        Text("Saldo Total", color = Color(0xFFFFFFFF))
        Text("R$ 1.000,00", color = Color(0xFFFFFFFF))
        
        val viewModel = AccountViewModel()
        val accountListState by viewModel.accountListState.collectAsState()
        Text(accountListState.toString())
    }
}