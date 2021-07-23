package com.rafael.apibitcoin.service

import com.rafael.apibitcoin.model.Asset
import com.rafael.apibitcoin.model.AssetHistory
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@Service
class AssetService {
    companion object {
        val API_URL = "https://api.coincap.io/v2"
    }
    val webClientBuilder = WebClient.builder().baseUrl(API_URL)

    suspend fun getAssetById(id: String): Asset = webClientBuilder.build().get().uri { uriBuilder ->
        uriBuilder.path("/assets/${id}")
        uriBuilder.build()
    }
        .retrieve().awaitBody()

    suspend fun getAssetHistoryByInterval(id: String, interval: String): AssetHistory = webClientBuilder.build().get().uri { uriBuilder ->
        uriBuilder.path("/assets/${id}/history?interval=${interval}")
        uriBuilder.build()
    }
        .retrieve().awaitBody()
}