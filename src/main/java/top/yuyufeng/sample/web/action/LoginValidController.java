package top.yuyufeng.sample.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.yuyufeng.sample.web.vo.UserValidVO;

import javax.validation.Valid;

@Controller
public class LoginValidController {

    private static UserValidVO userValidVO = new UserValidVO();

    /**
     * 跳转到登录界面
     *
     * @return
     */
    @RequestMapping(value = "/login-valid", method = RequestMethod.GET)
    public String toLogin(Model model) {
        model.addAttribute("userValidVO", userValidVO); //必须添加 不然Spring form标签会报错
        return "login-valid";
    }

    @RequestMapping(value = "/doValidLogin", method = RequestMethod.POST)
    public String userLogin(@Valid UserValidVO userValidVO, BindingResult br, Model model) {
        if (!br.hasErrors()) {
            model.addAttribute("loginValid", "success");
        }
        return "login-valid";
    }

}
