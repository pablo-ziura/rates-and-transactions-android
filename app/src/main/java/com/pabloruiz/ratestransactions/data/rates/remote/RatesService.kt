package com.pabloruiz.ratestransactions.data.rates.remote

import com.pabloruiz.ratestransactions.data.rates.remote.model.RemoteRateResponse
import retrofit2.Response
import retrofit2.http.GET

interface RatesService {
    @GET("rates.json")
    suspend fun getRatesInfo(): Response<List<RemoteRateResponse>>
}