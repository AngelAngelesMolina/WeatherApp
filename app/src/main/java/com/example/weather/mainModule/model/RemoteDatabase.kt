package com.example.weather.mainModule.model

import com.example.weather.common.dataAccess.WeatherService
import com.example.weather.common.entities.WeatherForecastEntity
import com.example.weather.common.utils.Constants
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDatabase {

    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(WeatherService::class.java)
    suspend fun getWeatherForecastByCoordinate(
        lat: Double,
        long: Double,
        appId: String,
        units: String,
        lang: String
    ): WeatherForecastEntity = withContext(Dispatchers.IO) {
        service.getWeatherForecastByCoordinate(lat, long, appId, units, lang)
    }

}