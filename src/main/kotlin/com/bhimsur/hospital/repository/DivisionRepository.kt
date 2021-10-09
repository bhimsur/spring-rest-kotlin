package com.bhimsur.hospital.repository

import com.bhimsur.hospital.entity.Division
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface DivisionRepository : JpaRepository<Division, UUID>