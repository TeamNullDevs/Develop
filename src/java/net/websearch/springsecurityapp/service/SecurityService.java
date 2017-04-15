package net.websearch.springsecurityapp.service;

/**
 * Service for Security.
 *
 * @author Nazar Kulik
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}