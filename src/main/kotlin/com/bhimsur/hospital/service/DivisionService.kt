package com.bhimsur.hospital.service

import com.bhimsur.hospital.entity.Division
import com.bhimsur.hospital.model.DivisionRequest
import com.bhimsur.hospital.model.DivisionResponse
import com.bhimsur.hospital.model.SuccessResponse
import com.bhimsur.hospital.repository.DivisionRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class DivisionService(val divisionRepository: DivisionRepository) : DivisionInterface {
    override fun createDivision(request: DivisionRequest): SuccessResponse {
        val division = Division(
            name = request.name!!,
            description = request.description!!,
            createdDate = Date(),
            updateDate = null
        )
        return SuccessResponse(status = !divisionRepository.save(division).id.equals(""))
    }

    override fun getDivision(id: UUID): DivisionResponse {
        return response(divisionRepository.findById(id).get())
    }

    override fun listDivision(): List<DivisionResponse> {
        val divisions: List<Division> = divisionRepository.findAll()
        return divisions.map { response(it) }
    }

    override fun updateDivision(request: DivisionRequest): SuccessResponse {
        val division = divisionRepository.findById(request.id!!).get()
        division.apply {
            name = request.name!!
            description = request.description!!
            updateDate = Date()
        }
        return SuccessResponse(status = !divisionRepository.save(division).id.equals(""))
    }

    override fun deleteDivision(id: UUID) {
        val division = divisionRepository.findById(id).get()
        divisionRepository.delete(division)
    }

    private fun response(division: Division): DivisionResponse {
        return DivisionResponse(
            id = division.id,
            name = division.name,
            description = division.description
        )
    }
}