package com.bhimsur.hospital.service

import com.bhimsur.hospital.model.DivisionRequest
import com.bhimsur.hospital.model.DivisionResponse
import com.bhimsur.hospital.model.SuccessResponse
import java.util.*

interface DivisionInterface {
    fun createDivision(request: DivisionRequest): SuccessResponse

    fun getDivision(id: UUID): DivisionResponse

    fun listDivision(): List<DivisionResponse>

    fun updateDivision(request: DivisionRequest): SuccessResponse

    fun deleteDivision(id: UUID)
}