package com.santebreezefsm.app.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.santebreezefsm.app.AppConstant

@Dao
interface VisitRevisitWhatsappStatusDao {

    @Insert
    fun insert(vararg obj: VisitRevisitWhatsappStatus)

    @Query("SELECT * FROM " + AppConstant.SHOP_VISIT_REVISIT_WHATSAPP_STATUS)
    fun getAll(): List<VisitRevisitWhatsappStatus?>?

    @Query("SELECT * FROM " + AppConstant.SHOP_VISIT_REVISIT_WHATSAPP_STATUS +" where shop_id=:shop_id and date=:date")
    fun getByShopIDDate(shop_id:String,date:String): VisitRevisitWhatsappStatus?

    @Query("update " + AppConstant.SHOP_VISIT_REVISIT_WHATSAPP_STATUS+" set isWhatsappSent=:isWhatsappSent,whatsappSentMsg=:whatsappSentMsg " +
            "where sl_no=:sl_no")
    fun updateWhatsStatus(isWhatsappSent:Boolean,whatsappSentMsg:String,sl_no:Int)
}