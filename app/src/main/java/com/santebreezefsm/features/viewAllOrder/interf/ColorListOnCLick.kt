package com.santebreezefsm.features.viewAllOrder.interf

import com.santebreezefsm.app.domain.NewOrderGenderEntity
import com.santebreezefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}