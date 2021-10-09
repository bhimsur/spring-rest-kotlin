package com.bhimsur.hospital.repository

import com.bhimsur.hospital.entity.Room
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RoomRepository : JpaRepository<Room, UUID>