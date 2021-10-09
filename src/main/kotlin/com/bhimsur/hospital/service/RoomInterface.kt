package com.bhimsur.hospital.service

import com.bhimsur.hospital.entity.Room
import com.bhimsur.hospital.model.SuccessResponse

interface RoomInterface {
    fun createRoom(request: Room): SuccessResponse
    fun listRoom(): List<Room>
}