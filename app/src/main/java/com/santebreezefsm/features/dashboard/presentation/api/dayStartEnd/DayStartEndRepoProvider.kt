package com.santebreezefsm.features.dashboard.presentation.api.dayStartEnd

import com.santebreezefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.santebreezefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}