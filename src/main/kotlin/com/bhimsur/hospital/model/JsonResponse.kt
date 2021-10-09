package com.bhimsur.hospital.model

data class JsonResponse<T>(
        val message: String?,
        val data: T
)
