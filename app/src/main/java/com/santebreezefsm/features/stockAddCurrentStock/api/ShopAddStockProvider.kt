package com.santebreezefsm.features.stockAddCurrentStock.api

import com.santebreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.santebreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}