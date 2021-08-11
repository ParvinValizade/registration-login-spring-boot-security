package com.company.registrationloginspringbootsecurity.services;

import com.company.registrationloginspringbootsecurity.model.User;
import com.company.registrationloginspringbootsecurity.webdto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
