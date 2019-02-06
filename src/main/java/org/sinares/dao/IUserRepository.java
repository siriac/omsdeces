package org.sinares.dao;

import org.sinares.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserRepository extends JpaRepository<User, Long> {
@Query("select u from User u where u.userName=:n and u.password=:p")
	public User findUser(@Param("n")String name, @Param("p")String Password);
}
