package com.santebreezefsm.features.weather.api

import com.santebreezefsm.base.BaseResponse
import com.santebreezefsm.features.task.api.TaskApi
import com.santebreezefsm.features.task.model.AddTaskInputModel
import com.santebreezefsm.features.weather.model.ForeCastAPIResponse
import com.santebreezefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}