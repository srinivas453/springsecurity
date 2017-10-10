
package org.mainlogic.spring.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("loggedInUser")
public class LoginController {

	@RequestMapping(value = "/portal", method = RequestMethod.GET)
	public ModelAndView mainPage(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();

		model.setViewName("portal");
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();

		if (error != null) {
			model.addObject("error", true);
			model.addObject("msg", "Invalid username or password!");
		}

		else if (logout != null)
			model.addObject("msg", "You've been logged out successfully.");

		model.setViewName("login");

		return model;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (auth != null)
			new SecurityContextLogoutHandler().logout(request, response, auth);

		request.getSession().invalidate();

		return "redirect:/login?logout";
	}
}