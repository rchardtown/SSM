package cn.ekgc.ssm.dkscm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ekgc.ssm.dkscm.controller.baseController.BaseController;

@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	/**
	 * <b>转发到登录页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() throws Exception {
		return "user/user_login_form";
	}

	/**
	 * 登录失败后的重定向
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginError() throws Exception {
		// 如果登录成功，按照ShiroDBRealm.java中的配置，默认转发到
		// 来时的页面，或者 /  ：对于首页面的这一种，具体见：IndexController.java
		// 如果的那个路失败：重定向到：/user/logout

		return "redirect:logout";

	}
}
