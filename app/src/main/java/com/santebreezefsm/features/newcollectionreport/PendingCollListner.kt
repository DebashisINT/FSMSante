package com.santebreezefsm.features.newcollectionreport

import com.santebreezefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}