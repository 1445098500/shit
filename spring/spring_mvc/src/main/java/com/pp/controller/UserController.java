package com.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {

    //TODO
    @RequestMapping("/quick8/{name}")
    @ResponseBody
    public String save8(@PathVariable String name){
        return name;
    }

    @RequestMapping("/quick7")
    @ResponseBody
    public String  save7(){
        return "response body";
    }

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("responseWriter");
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request){
        request.setAttribute("username","request");
        return "/jsp/success--";
    }

    @RequestMapping("/quick4")
    public String save4(Model model){
        model.addAttribute("username","poipoipoipo");
        return "/jsp/success--";
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("username","qweqweqweqwe");
        modelAndView.setViewName("/jsp/success--");
        return modelAndView;
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","seseseeses");
        modelAndView.setViewName("/jsp/success--");
        return modelAndView;
    }



    @RequestMapping("/quick")
    public String save(){
        System.out.println("controller save running");
        return "success";
    }
}
