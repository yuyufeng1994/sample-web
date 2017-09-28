package top.yuyufeng.sample.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String toIndex(Model model) {
        model.addAttribute("time",new Date());
        return "index";
    }

}
