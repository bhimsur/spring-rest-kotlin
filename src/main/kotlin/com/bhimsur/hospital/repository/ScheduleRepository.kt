package com.bhimsur.hospital.repository

import com.bhimsur.hospital.entity.Schedule
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ScheduleRepository: JpaRepository<Schedule, UUID>