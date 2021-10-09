package com.bhimsur.hospital.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "division")
data class Division(
        @Id
        @Column(name = "id")
        val id: UUID = UUID.randomUUID(),
        @Column(name = "name")
        var name: String,
        @Column(name = "description")
        var description: String,
        @Column(name = "created_at")
        val createdDate: Date,
        @Column(name = "updated_at")
        var updateDate: Date?
)
