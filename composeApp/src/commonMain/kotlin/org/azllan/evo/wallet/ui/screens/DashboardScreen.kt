package org.azllan.evo.wallet.ui.screens

import org.azllan.evo.wallet.ui.layouts.main.MainLayout
import org.azllan.evo.wallet.ui.components.cards.BalanceCard

import androidx.compose.runtime.Composable

@Composable
fun DashboardScreen() {
    MainLayout {
        BalanceCard()
    }
}