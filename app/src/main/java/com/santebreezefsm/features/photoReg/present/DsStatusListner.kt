package com.santebreezefsm.features.photoReg.present

import com.santebreezefsm.app.domain.ProspectEntity
import com.santebreezefsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}