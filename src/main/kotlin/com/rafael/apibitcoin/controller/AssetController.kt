package com.rafael.apibitcoin.controller

import com.rafael.apibitcoin.service.AssetService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/assets")
class AssetController(
    private val assetService: AssetService
) {
    @GetMapping("/{id}")
    suspend fun getAssetById(@PathVariable id: String) = assetService.getAssetById(id)

    @GetMapping("/{id}/history")
    suspend fun getAssetHistory(@PathVariable id: String, @RequestParam interval: String) =
        assetService.getAssetHistoryByInterval(id, interval)
}