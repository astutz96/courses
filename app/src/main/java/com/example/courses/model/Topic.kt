package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringRes: Int,
    val studentCount: Int,
    @DrawableRes val imgResourceId: Int,
)
