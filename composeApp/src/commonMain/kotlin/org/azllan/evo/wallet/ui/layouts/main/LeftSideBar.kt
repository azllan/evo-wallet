package org.azllan.evo.wallet.ui.layouts.main

import org.azllan.evo.wallet.ui.components.borders.rightBorder

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LeftSideBar() {
    Surface {
        Column(
            modifier = Modifier
                .rightBorder()
                .width(60.dp)
                .fillMaxHeight()
        ) {

        }
    }
}