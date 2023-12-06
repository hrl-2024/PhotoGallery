package com.bignerdranch.android.photogallery.api

import com.squareup.moshi.Json

data class PhotoResponse(
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)
