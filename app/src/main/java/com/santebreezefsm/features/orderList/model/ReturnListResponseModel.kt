package com.santebreezefsm.features.orderList.model

import com.santebreezefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}