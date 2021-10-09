package com.bhimsur.hospital.service

import com.bhimsur.hospital.entity.Room
import com.bhimsur.hospital.model.ScheduleResponse
import com.bhimsur.hospital.model.SuccessResponse
import com.bhimsur.hospital.repository.RoomRepository
import org.springframework.stereotype.Service

@Service
class RoomService(val roomRepository: RoomRepository) : RoomInterface {
    override fun createRoom(request: Room): SuccessResponse {
        return SuccessResponse(status = !roomRepository.save(request).id.equals(""))
    }

    override fun listRoom(): List<Room> {
        return roomRepository.findAll()
    }
}