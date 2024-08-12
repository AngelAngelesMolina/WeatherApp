package com.example.weather.mainModule.model

import com.example.weather.common.entities.WeatherForecastEntity

class MainRepository {

    private val remoteDatabase = RemoteDatabase()
    suspend fun getWeatherAndForecast(
        lat: Double,
        long: Double,
        appId: String,
        units: String,
        lang: String
    ): WeatherForecastEntity =
        remoteDatabase.getWeatherForecastByCoordinate(lat, long, appId, units, lang)

}