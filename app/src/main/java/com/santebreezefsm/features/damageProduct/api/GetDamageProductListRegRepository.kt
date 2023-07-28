package com.santebreezefsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.santebreezefsm.app.FileUtils
import com.santebreezefsm.base.BaseResponse
import com.santebreezefsm.features.NewQuotation.model.*
import com.santebreezefsm.features.addshop.model.AddShopRequestData
import com.santebreezefsm.features.addshop.model.AddShopResponse
import com.santebreezefsm.features.damageProduct.model.DamageProductResponseModel
import com.santebreezefsm.features.damageProduct.model.delBreakageReq
import com.santebreezefsm.features.damageProduct.model.viewAllBreakageReq
import com.santebreezefsm.features.login.model.userconfig.UserConfigResponseModel
import com.santebreezefsm.features.myjobs.model.WIPImageSubmit
import com.santebreezefsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}