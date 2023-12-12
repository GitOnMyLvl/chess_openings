package at.vinatzer.chessopenings.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Opening (
    @StringRes val name: Int,
    @StringRes val notation: Int,
    @DrawableRes val image: Int
)