package top.yuyufeng.sample.web.action;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.yuyufeng.sample.web.vo.UserVO;

import java.util.Date;

@Controller
public class LoginController {
    /**
     * 跳转到登录界面
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * 执行登录
     * @param model
     * @param userVO
     * @return
     */
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(Model model, UserVO userVO) {
        UserVO user = new UserVO();
        BeanUtils.copyProperties(userVO, user);
        model.addAttribute("userVO",user);
        return "login";
    }
}
