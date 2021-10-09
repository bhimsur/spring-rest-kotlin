package com.bhimsur.hospital.controller

import com.bhimsur.hospital.model.JsonResponse
import com.bhimsur.hospital.model.ScheduleResponse
import com.bhimsur.hospital.service.ScheduleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/schedule"], produces = ["application/json"])
class ScheduleController(val scheduleService: ScheduleService) {
    @GetMapping
    fun listSchedule(): JsonResponse<List<ScheduleResponse>> {
        return JsonResponse(
            message = null,
            data = scheduleService.listSchedule()
        )
    }
}