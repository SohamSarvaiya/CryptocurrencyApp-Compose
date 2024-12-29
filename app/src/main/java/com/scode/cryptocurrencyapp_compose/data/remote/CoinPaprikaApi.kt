package com.scode.cryptocurrencyapp_compose.data.remote

import com.scode.cryptocurrencyapp_compose.data.remote.dto.CoinDetailDto
import com.scode.cryptocurrencyapp_compose.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}