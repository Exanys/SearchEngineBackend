package org.exanys.suggester.api

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*


val client = HttpClient()

object Elastic{
    suspend fun getEverything(): String {
        return client.get("http://localhost:9200/").body()
    }
}

