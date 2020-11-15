package com.javaguys.fastnotes.controller;

import com.javaguys.fastnotes.model.Role;
import com.javaguys.fastnotes.model.UserAccount;
import com.javaguys.fastnotes.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class RegistrationController
{
	@Autowired
	private UserAccountRepository userAccountRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/registration")
	public String registration()
	{
		return "registration";
	}

	@PostMapping("/registration")
	public String addUser(String name, String email, String password)
	{
		UserAccount user = new UserAccount();
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));
		user.setEnabled(true);
		user.setRoles(Collections.singleton(Role.USER));

		userAccountRepository.save(user);

		return "redirect:/login";
	}
}
