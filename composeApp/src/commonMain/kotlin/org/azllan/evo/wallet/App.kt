package org.azllan.evo.wallet

import org.azllan.evo.wallet.ui.themes.default.Theme
import org.azllan.evo.wallet.ui.screens.DashboardScreen

import androidx.compose.runtime.Composable

import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    Theme {
        DashboardScreen()
    }
}