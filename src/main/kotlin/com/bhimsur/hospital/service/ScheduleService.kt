package com.bhimsur.hospital.service

import com.bhimsur.hospital.entity.Schedule
import com.bhimsur.hospital.model.ScheduleResponse
import com.bhimsur.hospital.repository.ScheduleRepository
import org.springframework.stereotype.Service

@Service
class ScheduleService(val scheduleRepository: ScheduleRepository) : ScheduleInterface {
    override fun listSchedule(): List<ScheduleResponse> {
        val schedules: List<Schedule> = scheduleRepository.findAll()
        return schedules.map { schedule -> ScheduleResponse(id = schedule.id, dateTime = schedule.dateTime) }
    }
}