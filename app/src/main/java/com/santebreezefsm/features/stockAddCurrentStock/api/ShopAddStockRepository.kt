package com.santebreezefsm.features.stockAddCurrentStock.api

import com.santebreezefsm.base.BaseResponse
import com.santebreezefsm.features.location.model.ShopRevisitStatusRequest
import com.santebreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.santebreezefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.santebreezefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.santebreezefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}