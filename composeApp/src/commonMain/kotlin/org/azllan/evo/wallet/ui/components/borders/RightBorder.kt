package org.azllan.evo.wallet.ui.components.borders

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Modifier.rightBorder(
    color: Color = MaterialTheme.colorScheme.outline,
    thickness: Dp = 1.dp
) = drawBehind {
    val strokeWidth = thickness.toPx()
    val x = size.width - strokeWidth / 2
    
    drawLine(
        color = color,
        start = Offset(x, 0f),
        end = Offset(x, size.height),
        strokeWidth = strokeWidth,
        cap = StrokeCap.Square
    )
}