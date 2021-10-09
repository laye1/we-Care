package org.spring.we_care.services;

import java.util.Optional;

import org.spring.we_care.model.User;
import org.spring.we_care.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Page<User> pageUsers(Pageable pageable){
		return this.userRepository.findAll(pageable);
	}
	
	public Optional<User> getOne(int id){
		return this.userRepository.findById(id);
	}
	
	public Optional<User> getUsernameByUser(String username){
		return this.userRepository.findByUsernameContaining(username);
	}
	
	public Optional<User> getEmailByUser(String email){
		return this.userRepository.findByEmailContaining(email);
	}
	
	public Optional<User> getPhoneNumberByUser(String phone){
		return this.userRepository.findByPhoneContaining(phone);
	}
	
	public Optional<User> getCodeByUser(String code){
		return this.userRepository.findByCodeContaining(code);
	}
	
	public Optional<User> getPinCodeByUser(String pinCode){
		return this.userRepository.findByPinCodeContaining(pinCode);
	}
	
	public void saveUser(User user) {
		this.userRepository.save(user);
	}
	
	public void updateUser(User user) {
		this.userRepository.save(user);
	}
	
	public void deleteUserById(int id) {
		this.userRepository.deleteById(id);
	}
	
	public Boolean existsById(int id) {
		return this.existsById(id);
	}
	
	public Boolean existsByUsername(String username) {
		return this.userRepository.existsByUsername(username);
	}
	
	public Boolean existsByEmail(String email) {
		return this.userRepository.existsByEmail(email);
	}
	
	public Boolean existsByPhoneNumber(String phone) {
		return this.userRepository.existsByPhoneNumber(phone);
	}
	
	public Boolean existsByCode(String code) {
		return this.userRepository.existsByCode(code);
	}
	
	public Boolean existsByPinCode(String pinCode) {
		return this.userRepository.existsByPinCode(pinCode);
	}
}
