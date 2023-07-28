package com.santebreezefsm.features.location.api

import com.santebreezefsm.features.location.shopdurationapi.ShopDurationApi
import com.santebreezefsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}