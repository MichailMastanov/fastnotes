package com.javaguys.fastnotes.service;

import com.javaguys.fastnotes.model.UserAccount;
import com.javaguys.fastnotes.repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService
{
	@Autowired
	private UserAccountRepository userAccountRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		UserAccount userFindByUsername = userAccountRepository.findByEmail(username);
//		UserAccount userFindByName = userAccountRepository.findByName(username);
//		UserAccount userFindByGoogleUsername = userAccountRepository.findByGoogleUsername(username);
//		UserAccount userFindByGoogleName = userAccountRepository.findByGoogleName(username);

		if(userFindByUsername != null)
		{
			return userFindByUsername;
		}

//		if(userFindByName != null)
//		{
//			return userFindByName;
//		}
//
//		if(userFindByGoogleUsername != null)
//		{
//			return userFindByGoogleUsername;
//		}
//
//		if(userFindByGoogleName != null)
//		{
//			return userFindByGoogleName;
//		}

		return null;
	}
}

