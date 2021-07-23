package com.rafael.apibitcoin.model

import java.math.BigDecimal

data class AssetHistory(
    val data: List<AssetTransaction>
)

data class AssetTransaction(
    val priceUsd: BigDecimal,
    val time: Long
)
