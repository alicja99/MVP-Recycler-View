package com.mvp.model.pojo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val adult: Boolean?,
    val id: Int,
    val original_language: String?,
    val original_title: String?,
    val overview: String?,
    val popularity: Double,
    val poster_path: String?,
    val release_date: String?,
    val title: String?,
    val vote_average: Double,
    val vote_count: Int
) : Parcelable