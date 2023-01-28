package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// as both constructor params are Int
// for caution we use annotation for user info
data class Affirmation(
    //string resource annotation for strings.xml
    @StringRes
    val stringResourceId: Int,
    // drawable resource annotation for drawable.xml
    @DrawableRes
    val imageResourceId: Int
)
