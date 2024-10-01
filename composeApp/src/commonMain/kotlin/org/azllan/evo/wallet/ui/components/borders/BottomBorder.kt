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
fun Modifier.bottomBorder(
    color: Color = MaterialTheme.colorScheme.outline,
    thickness: Dp = 1.dp
) = drawBehind {
    val strokeWidth = thickness.toPx()
    val y = size.height - strokeWidth / 2
    
    drawLine(
        color = color,
        start = Offset(0f, y),
        end = Offset(size.width, y),
        strokeWidth = strokeWidth,
        cap = StrokeCap.Square
    )
}