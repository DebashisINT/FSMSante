package com.santebreezefsm.features.lead.api

import com.santebreezefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.santebreezefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}