package com.towntalk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.towntalk.domain.SayVO;
import com.towntalk.service.SayService;

@Controller
@RequestMapping("/say/*")
public class SayController {

	private static final Logger logger = LoggerFactory.getLogger(SayController.class);

	@Autowired
	private SayService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(SayVO say, Model model) throws Exception {
		logger.info("register get....");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(SayVO say, RedirectAttributes rttr) throws Exception {
		logger.info("register post...");
		logger.info(say.toString());

		service.regist(say);

		rttr.addFlashAttribute("msg", "reg");
		return "redirect:/say/sayList";
	}

	@RequestMapping(value = "/sayList", method = RequestMethod.GET)
	public void sayList(Model model) throws Exception {
		logger.info("show all say list......");
		model.addAttribute("sayList", service.sayList());
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("sno") int sno, Model model) throws Exception {
		model.addAttribute(service.read(sno));
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("sno") int sno, RedirectAttributes rttr) throws Exception {

		service.remove(sno);
		rttr.addFlashAttribute("msg", "del");
		return "redirect:/say/sayList";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int sno, Model model) throws Exception {
		model.addAttribute(service.read(sno));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(SayVO say, RedirectAttributes rttr) throws Exception {
		logger.info("mod post........");

		service.modify(say);
		rttr.addFlashAttribute("msg", "mod");

		return "redirect:/say/sayList";
	}
}
