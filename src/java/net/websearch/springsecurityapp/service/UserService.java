package net.websearch.springsecurityapp.service;

import net.websearch.springsecurityapp.model.User;

/**
 * Service class for {@link net.websearch.springsecurityapp.model.User}
 *
 * @author Nazar Kulik
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}