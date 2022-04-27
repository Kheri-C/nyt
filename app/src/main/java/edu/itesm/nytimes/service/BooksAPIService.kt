package edu.itesm.nytimes

import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("hardcover-fiction.json?api-key=3AlAv6HcAAAx3naCwDAM3yEUpHYoa13n")
    suspend fun getBooks() : Response<Results>
}