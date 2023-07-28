package com.santebreezefsm.features.viewAllOrder.orderOptimized

import com.santebreezefsm.app.domain.ProductOnlineRateTempEntity
import com.santebreezefsm.base.BaseResponse
import com.santebreezefsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}