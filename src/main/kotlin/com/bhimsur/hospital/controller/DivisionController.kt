package com.bhimsur.hospital.controller

import com.bhimsur.hospital.model.DivisionRequest
import com.bhimsur.hospital.model.DivisionResponse
import com.bhimsur.hospital.model.JsonResponse
import com.bhimsur.hospital.model.SuccessResponse
import com.bhimsur.hospital.service.DivisionService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(value = ["/api/division"], produces = ["application/json"])
class DivisionController(val divisionService: DivisionService) {
    @PostMapping(
        consumes = ["application/json"]
    )
    fun createDivision(@RequestBody request: DivisionRequest): JsonResponse<SuccessResponse> {
        return JsonResponse(
            message = null,
            data = divisionService.createDivision(request)
        )
    }

    @GetMapping(
        value = ["/{id}"],
    )
    fun getDivision(@PathVariable("id") id: UUID): JsonResponse<DivisionResponse> {
        return JsonResponse(
            message = null,
            data = divisionService.getDivision(id)
        )
    }

    @GetMapping
    fun listDivision(): JsonResponse<List<DivisionResponse>> {
        return JsonResponse(
            message = null,
            data = divisionService.listDivision()
        )
    }

    @PutMapping(
        consumes = ["application/json"]
    )
    fun updateDivision(request: DivisionRequest): JsonResponse<SuccessResponse> {
        return JsonResponse(
            message = null,
            data = divisionService.updateDivision(request)
        )
    }

    @DeleteMapping(
        value = ["/{id}"]
    )
    fun deleteDivision(@PathVariable("id") id: UUID): JsonResponse<UUID> {
        divisionService.deleteDivision(id)
        return JsonResponse(
            message = null,
            data = id
        )
    }
}