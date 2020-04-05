package com.cntech.study.controller

import com.cntech.study.model.ApiErrEntity
import com.cntech.study.service.ApiService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

/**
 * Created by Sang Won Hyun on 2020-04-01.
 */
@Controller
class MainController(val apiService : ApiService){

    @GetMapping("/")
    fun loadMainPage() : ModelAndView{

        val errList :List<ApiErrEntity>? =  apiService.apiErrFindAll()
        var size = 0
        if(errList != null){
            size = errList.size
        }

        return ModelAndView("index").apply {
            addObject("list",errList)
            addObject("size",size)
        }
    }


}