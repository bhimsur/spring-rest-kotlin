package com.bhimsur.hospital.entity

import com.bhimsur.hospital.constant.BloodType
import com.bhimsur.hospital.constant.Gender
import com.bhimsur.hospital.constant.Role
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(
    @Id
    @Column(name = "id")
    val id: UUID = UUID.randomUUID(),

    @Column(name = "name")
    var name: String,

    @Column(name="gender")
    val gender: Gender,

    @Column(name="gender")
    val dateOfBirth: Date,

    @Column(name="address")
    var address: String,

    @Column(name="blood_type")
    val bloodType: BloodType,

    @Column(name="role")
    val role: Role,

    @Column(name="username")
    val username: String,

    @Column(name="password")
    var password: String,

    @Column(name="email")
    var email: String
)
