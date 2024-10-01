package org.azllan.evo.wallet.ui.themes.default

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val ThemeLightColors = lightColorScheme(
    primary = Color.GREEN_500,
    onPrimary = Color.WHITE,
    background = Color.ZINC_900,
    onBackground = Color.ZINC_200,
    surfaceContainer = Color.ZINC_200
)

private val ThemeDarkColors = darkColorScheme(
    primary = Color.GREEN_500,
    onPrimary = Color.WHITE,
    background = Color.ZINC_900,
    onBackground = Color.ZINC_200,
    surface = Color.ZINC_700,
    outline = Color.ZINC_600
)

//@Composable
//private fun ThemeTypography() = Typography().run {
//    val fontFamily = NunitoSansFamily()
//    copy(
//        displayLarge = displayLarge.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        displayMedium = displayMedium.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        displaySmall = displaySmall.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        headlineLarge = headlineLarge.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        headlineMedium = headlineMedium.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        headlineSmall = headlineSmall.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        titleLarge = titleLarge.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        titleMedium = titleMedium.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        titleSmall = titleSmall.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        bodyLarge = bodyLarge.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        bodyMedium = bodyMedium.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        bodySmall = bodySmall.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        labelLarge = labelLarge.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        labelMedium = labelMedium.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        ),
//        labelSmall = labelSmall.copy(
//            fontFamily = fontFamily,
//            color = MaterialTheme.colorScheme.onBackground
//        )
//    )
//}

@Composable
fun Theme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) {
        ThemeDarkColors
    } else {
        ThemeLightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
//        typography = ThemeTypography(),
    ) {
        content()
    }
}