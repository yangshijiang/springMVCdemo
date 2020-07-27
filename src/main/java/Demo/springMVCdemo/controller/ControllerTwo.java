package Demo.springMVCdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
@Author:杨世江
@Description:
*/
@SessionAttributes("username1")
@Controller
public class ControllerTwo {
    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam(value = "username",defaultValue = "jiang",required = false) String username
    , HttpServletRequest request) {
        ModelAndView mad = new ModelAndView("login");
        HttpSession session=request.getSession();
        mad.addObject("username1","yangshijiang");
        mad.addObject("user","变量注入");
        System.out.println(username);
        return mad;
    }
}
