package org.example.service;

import java.util.List;
import java.util.Optional;

import org.example.domain.User;
import org.example.dto.UserDto;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	/*@Transactional(isolation = Isolation.READ_COMMITTED)
	public String creditCalculate(Long id){

		User user = userRepository.findOne(id);

		if(user.getCreditScore() < 500){
			user.setStatus(false);
			return "Kredi alamaz.";
		}
		else if(user.getCreditScore()>= 500 && user.getCreditScore()<= 1000){
			return "Kredi alabilir.";
		}
		else{
			return "Kredi alamaz.";
		}
	}*/

	@Transactional(isolation = Isolation.READ_COMMITTED)
	public User creditCalculate2(UserDto user){
		User response = userRepository.findByIdentity(user.getIdentity());
		if(response.getCreditscore() < 500){
			response.setStatus(false);
			response.setName(user.getName());
			response.setPhone(user.getPhone());
			response.setIncome(user.getIncome());
			response.setTotal(0L);
			return response;
		}
		else if(response.getCreditscore()>= 500 && response.getCreditscore()<= 1000 && response.getIncome() < 5000){
			response.setStatus(true);
			response.setName(user.getName());
			response.setPhone(user.getPhone());
			response.setIncome(user.getIncome());
			response.setTotal(10000L);
			return response;
		}else if(response.getCreditscore()>= 500 && response.getCreditscore()<= 1000 && response.getIncome() >= 5000){
			response.setStatus(true);
			response.setName(user.getName());
			response.setPhone(user.getPhone());
			response.setIncome(user.getIncome());
			response.setTotal(response.getIncome() * 4);
			return response;

		}
		else if(response.getCreditscore() >= 1000){
			response.setStatus(true);
			response.setName(user.getName());
			response.setPhone(user.getPhone());
			response.setIncome(user.getIncome());
			response.setTotal(response.getIncome() * 4);
			return response;
		}
		else{
			response.setStatus(false);
			response.setName(user.getName());
			response.setPhone(user.getPhone());
			response.setIncome(user.getIncome());
			response.setTotal(0L);
			return response;
		}
	}

}
