package com.bhimsur.hospital.repository

import com.bhimsur.hospital.entity.User
import com.bhimsur.hospital.model.UserLoginResponse
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, UUID> {
    fun findByUsernameAndPassword(username: String, password: String): UserLoginResponse
}