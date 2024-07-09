package com.cycode.plugin.cli.models

data class AuthCheckResult(
    val result: Boolean,
    val message: String,
    val data: AuthCheckResultData,
)

data class AuthCheckResultData(
    val userId: String,
    val tenantId: String,
)
