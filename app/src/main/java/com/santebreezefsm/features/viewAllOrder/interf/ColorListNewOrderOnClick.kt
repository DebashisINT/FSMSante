package com.santebreezefsm.features.viewAllOrder.interf

import com.santebreezefsm.app.domain.NewOrderColorEntity
import com.santebreezefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}