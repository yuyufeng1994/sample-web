package top.yuyufeng.sample.web.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.yuyufeng.sample.web.vo.UserVO;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class LoginController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    /**
     * 跳转到登录界面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin(Model model) {
        return "login";
    }

    /**
     * 执行登录
     *
     * @param model
     * @param userVO
     * @return
     */
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(Model model, @Valid UserVO userVO,BindingResult br) {   //@Valid 验证   //BindingResult 验证是失败的字段的错误信息 放置在该实现类中
//    public String doLogin(Model model, UserVO userVO) {   //@Valid 验证   //BindingResult 验证是失败的字段的错误信息 放置在该实现类中
        if(br.hasErrors()){
            //获取验证失败数量
            LOG.debug(String.valueOf(br.getErrorCount()));
            List<ObjectError> errors = br.getAllErrors();
            model.addAttribute("errors", errors);
            for(ObjectError error :errors){
                LOG.debug(error.getDefaultMessage());
            }
            return "login";
        }
        UserVO user = new UserVO();
        BeanUtils.copyProperties(userVO, user);
        model.addAttribute("userVO", user);
        return "login";
    }
}
