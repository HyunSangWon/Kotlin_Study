package com.cntech.study.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

/**
 * Created by Sang Won Hyun on 2020-04-01.
 */
@Controller
class MainController{

    @GetMapping("/main")
    fun loadMainPage() : ModelAndView{

        return ModelAndView("index").apply {
            addObject("name","Sang Won Hyun")
        }

    }
}