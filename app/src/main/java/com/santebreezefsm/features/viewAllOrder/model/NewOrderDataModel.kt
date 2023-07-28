package com.santebreezefsm.features.viewAllOrder.model

import com.santebreezefsm.app.domain.NewOrderColorEntity
import com.santebreezefsm.app.domain.NewOrderGenderEntity
import com.santebreezefsm.app.domain.NewOrderProductEntity
import com.santebreezefsm.app.domain.NewOrderSizeEntity
import com.santebreezefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

