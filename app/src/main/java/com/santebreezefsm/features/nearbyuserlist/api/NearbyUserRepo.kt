package com.santebreezefsm.features.nearbyuserlist.api

import com.santebreezefsm.app.Pref
import com.santebreezefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.santebreezefsm.features.newcollection.model.NewCollectionListResponseModel
import com.santebreezefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}