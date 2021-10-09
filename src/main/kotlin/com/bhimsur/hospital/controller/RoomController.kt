package com.bhimsur.hospital.controller

import com.bhimsur.hospital.entity.Room
import com.bhimsur.hospital.model.JsonResponse
import com.bhimsur.hospital.model.SuccessResponse
import com.bhimsur.hospital.service.RoomService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/room"], produces = ["application/json"])
class RoomController(val roomService: RoomService) {
    @PostMapping(
        consumes = ["application/json"]
    )
    fun createRoom(request: Room): JsonResponse<SuccessResponse> {
        return JsonResponse(
            message = null,
            data = roomService.createRoom(request)
        )
    }

    @GetMapping
    fun listRoom(): JsonResponse<List<Room>> {
        return JsonResponse(
            message = null,
            data = roomService.listRoom()
        )
    }
}