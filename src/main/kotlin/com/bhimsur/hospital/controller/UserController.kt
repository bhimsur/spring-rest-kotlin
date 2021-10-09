package com.bhimsur.hospital.controller

import com.bhimsur.hospital.model.JsonResponse
import com.bhimsur.hospital.model.UserLoginRequest
import com.bhimsur.hospital.model.UserLoginResponse
import com.bhimsur.hospital.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/user"], produces = ["application/json"])
class UserController(val userService: UserService) {
    @PostMapping(
        consumes = ["application/json"]
    )
    fun userLogin(request: UserLoginRequest): JsonResponse<UserLoginResponse> {
        return JsonResponse(
            message = null,
            data = userService.userLogin(request)
        )
    }
}