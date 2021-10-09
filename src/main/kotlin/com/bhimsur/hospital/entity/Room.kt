package com.bhimsur.hospital.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "room")
data class Room(
        @Id
        @Column(name = "id")
        val id: UUID = UUID.randomUUID(),
        @Column(name = "building")
        var building: String,
        @Column(name = "room")
        var room: String,
)
