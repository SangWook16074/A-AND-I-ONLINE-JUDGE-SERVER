package com.aandiclub.online.judge.config

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CorsConfigTest {

    @Test
    fun `default cors origins include public swagger api host`() {
        val properties = CorsProperties()

        assertTrue(properties.apiAllowedOriginPatterns.contains("https://api.aandiclub.com"))
    }
}
