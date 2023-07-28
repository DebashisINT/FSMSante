package com.santebreezefsm.features.login.model.productlistmodel

import com.santebreezefsm.app.domain.ModelEntity
import com.santebreezefsm.app.domain.ProductListEntity
import com.santebreezefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}