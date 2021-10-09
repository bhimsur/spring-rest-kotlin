package com.bhimsur.hospital.model

import java.util.*
import javax.management.relation.Role

data class UserLoginResponse(
    val id: UUID,
    val role: Role,
    val username: String
)
