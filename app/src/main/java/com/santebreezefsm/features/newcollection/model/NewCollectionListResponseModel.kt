package com.santebreezefsm.features.newcollection.model

import com.santebreezefsm.app.domain.CollectionDetailsEntity
import com.santebreezefsm.base.BaseResponse
import com.santebreezefsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}