package com.javaguys.fastnotes.repositories;

import com.javaguys.fastnotes.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long>
{
	UserAccount findByEmail(String email);
}
