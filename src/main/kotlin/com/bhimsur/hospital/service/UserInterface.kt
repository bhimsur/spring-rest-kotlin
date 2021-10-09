package com.bhimsur.hospital.service

import com.bhimsur.hospital.model.UserLoginRequest
import com.bhimsur.hospital.model.UserLoginResponse

interface UserInterface {
    fun userLogin(request: UserLoginRequest) : UserLoginResponse
}