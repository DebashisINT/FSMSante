package com.santebreezefsm.features.taskManagement

import com.santebreezefsm.base.BaseResponse


data class PriorityTaskSel(var task_priority_list:ArrayList<TaskPriorityResponse> = ArrayList()): BaseResponse()

data class TaskPriorityResponse (var task_priority_id:String = "",
                                     var task_priority_name:String = "")


