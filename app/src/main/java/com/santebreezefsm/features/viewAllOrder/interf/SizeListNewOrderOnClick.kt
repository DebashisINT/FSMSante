package com.santebreezefsm.features.viewAllOrder.interf

import com.santebreezefsm.app.domain.NewOrderProductEntity
import com.santebreezefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}