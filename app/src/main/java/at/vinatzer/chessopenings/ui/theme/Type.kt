package at.vinatzer.chessopenings.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import at.vinatzer.chessopenings.R

val Roboto = FontFamily(
    Font(R.font.roboto_regular),
    Font(R.font.roboto_bold, FontWeight.Bold)
    )

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
          fontFamily = Roboto,
          fontWeight = FontWeight.Bold,
          fontSize = 20.sp
     ),
    displaySmall = TextStyle(
          fontFamily = Roboto,
          fontWeight = FontWeight.Bold,
          fontSize = 14.sp
     ),
    bodyLarge = TextStyle(
          fontFamily = Roboto,
          fontWeight = FontWeight.Normal,
          fontSize = 14.sp
     ),
    bodyMedium = TextStyle(
          fontFamily = Roboto,
          fontWeight = FontWeight.Normal,
          fontSize = 20.sp
     )
)