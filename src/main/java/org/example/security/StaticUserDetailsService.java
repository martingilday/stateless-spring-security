package org.example.security;

import com.google.common.collect.ImmutableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("staticUserDetailsService")
public class StaticUserDetailsService implements UserDetailsService {
    private Logger log = LoggerFactory.getLogger(getClass());

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("USER LOOKUP");

        if(!username.startsWith("martin")) {
            throw new UsernameNotFoundException("All users start with martin");
        }

        return new User(username, "password", ImmutableList.of(new SimpleGrantedAuthority("ROLE_USER")));
    }

}
