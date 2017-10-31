package com.justin.app.testoauth.services;

import com.justin.app.testoauth.domain.user.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(final String s) throws UsernameNotFoundException {
        return new User("justin","joseph");
    }
}
