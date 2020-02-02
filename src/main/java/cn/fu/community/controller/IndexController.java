package cn.fu.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 65189
 * @date 2020-02-02 22:31
 * @ClassName
 * @Describtion
 */
@Controller
public class IndexController
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
}
