package com.hendisantika.userservice.config;

import com.hendisantika.userservice.entity.Role;
import com.hendisantika.userservice.repository.RoleRepository;
import com.hendisantika.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/11/20
 * Time: 05.33
 */
@Component
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final boolean alreadySetup = false;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        if (alreadySetup) {
            return;
        }
        // Create initial roles
        Role userRole = createRoleIfNotFound(Role.ROLE_USER);
        Role adminRole = createRoleIfNotFound(Role.ROLE_ADMIN);
        Role modRole = createRoleIfNotFound(Role.ROLE_MODERATOR);
        createUserIfNotFound("admin@javachinna.com", Set.of(userRole, adminRole, modRole));
        alreadySetup = true;
    }
}
