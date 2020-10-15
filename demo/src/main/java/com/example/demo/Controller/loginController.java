package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author JOE
 * 转发至templates的文件资源
 */
@Controller
public class loginController{
		@GetMapping("/Show")
		public String Login() {
			return "Show";
		}
}