package org.example.repository;

import java.util.List;
import java.util.Optional;

import org.example.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	//User save(User user);

	//User findOne(Long identity);

	//User findByIdentityAndIncome(Long identity, Long income);

	@Query(value = "Select * from user where identity = :identity limit 1",nativeQuery = true)
	User findByIdentity(@Param("identity") Long identity);

	//Optional<User> findByName(String name);


	List<User> findAll();

	//void deleteById(Long id);

	//Optional<User> findById(Long id);
	/*@Query(value = "Select * from User where firstname = :firstname limit 1",nativeQuery = true)
	Optional<User> findByFirstname(@Param("firstname") String firstname);*/
	//Optional<User> findByLastname(String lastname);
}