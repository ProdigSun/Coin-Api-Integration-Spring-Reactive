package com.rafael.apibitcoin.model

import java.math.BigDecimal

data class Asset(
    val data: AssetData
)

data class AssetData(
    val id: String,
    val rank: Long,
    val symbol: String,
    val name: String,
    val supply: BigDecimal,
    val maxSupply: BigDecimal,
    val volumeUsd24Hr: BigDecimal,
    val explorer: String,
    val changePercent24Hr: BigDecimal
)
