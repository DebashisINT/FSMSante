package com.santebreezefsm.features.viewAllOrder.interf

import com.santebreezefsm.app.domain.NewOrderGenderEntity
import com.santebreezefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}