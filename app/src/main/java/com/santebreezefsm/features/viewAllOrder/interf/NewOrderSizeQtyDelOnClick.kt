package com.santebreezefsm.features.viewAllOrder.interf

import com.santebreezefsm.app.domain.NewOrderGenderEntity
import com.santebreezefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}