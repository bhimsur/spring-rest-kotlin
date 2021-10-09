package com.bhimsur.hospital.service

import com.bhimsur.hospital.model.UserLoginRequest
import com.bhimsur.hospital.model.UserLoginResponse
import com.bhimsur.hospital.repository.UserRepository
import org.springframework.stereotype.Service
import javax.security.auth.login.AccountNotFoundException

@Service
class UserService(val userRepository: UserRepository) : UserInterface {
    override fun userLogin(request: UserLoginRequest): UserLoginResponse {
        return userRepository.findByUsernameAndPassword(request.username, request.password)
    }
}