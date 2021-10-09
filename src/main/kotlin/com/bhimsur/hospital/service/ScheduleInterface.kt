package com.bhimsur.hospital.service

import com.bhimsur.hospital.model.ScheduleResponse

interface ScheduleInterface {
    fun listSchedule(): List<ScheduleResponse>
}