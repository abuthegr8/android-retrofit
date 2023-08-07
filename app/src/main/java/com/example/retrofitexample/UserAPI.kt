package com.example.retrofitexample

import retrofit2.Response
import retrofit2.http.GET

interface UserAPI {
    @GET("/users")
    suspend fun getUser(): Response<UserList>
}