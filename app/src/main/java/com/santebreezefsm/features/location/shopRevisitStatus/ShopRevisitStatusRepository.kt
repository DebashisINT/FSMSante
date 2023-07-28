package com.santebreezefsm.features.location.shopRevisitStatus

import com.santebreezefsm.base.BaseResponse
import com.santebreezefsm.features.location.model.ShopDurationRequest
import com.santebreezefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}