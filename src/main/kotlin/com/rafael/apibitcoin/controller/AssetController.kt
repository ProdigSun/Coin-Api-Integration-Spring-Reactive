package com.rafael.apibitcoin.controller

import com.rafael.apibitcoin.service.AssetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/assets")
class AssetController(
    private val assetService: AssetService
) {
    @GetMapping("/{id}")
    suspend fun getAssetById(@PathVariable id: String) = assetService.getAssetById(id)
}