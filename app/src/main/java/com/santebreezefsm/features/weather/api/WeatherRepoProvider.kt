package com.santebreezefsm.features.weather.api

import com.santebreezefsm.features.task.api.TaskApi
import com.santebreezefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}