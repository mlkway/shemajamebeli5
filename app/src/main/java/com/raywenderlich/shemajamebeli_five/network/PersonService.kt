package com.raywenderlich.shemajamebeli_five.network

import com.raywenderlich.shemajamebeli_five.data.PersonSubListItem
import retrofit2.Response
import retrofit2.http.GET

interface PersonService {


    @GET("v3/d531f5f5-180d-4364-bae7-791dae87f732")
    suspend fun getPerson(): List<List<PersonSubListItem>>

}