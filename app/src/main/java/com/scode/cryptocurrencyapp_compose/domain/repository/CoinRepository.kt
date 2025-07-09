package com.scode.cryptocurrencyapp_compose.domain.repository
import com.scode.cryptocurrencyapp_compose.data.remote.dto.CoinDetailDto
import com.scode.cryptocurrencyapp_compose.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}