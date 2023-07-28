package com.santebreezefsm.features.location.shopRevisitStatus

import com.santebreezefsm.features.location.shopdurationapi.ShopDurationApi
import com.santebreezefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}