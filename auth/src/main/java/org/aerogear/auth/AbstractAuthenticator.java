package org.aerogear.auth;

import org.aerogear.auth.credentials.ICredential;

import java.security.Principal;

/**
 * Base class for all authenticators
 */
public class AbstractAuthenticator {

    /**
     * Authentication service configuration.
     */
    private final AuthServiceConfig config;

    public AbstractAuthenticator(final AuthServiceConfig config) {
        this.config = config;
    }

    /**
     * This method must be overridden with the custom authentication for the given credential.
     *
     * @param credential user credential
     * @return the authenticated principal
     */
    public Principal authenticate(final ICredential credential) throws AuthenticationException {
        throw new IllegalStateException("Not implemented");
    }

    /**
     * Logout the given principal
     * @param principal principal to be log out
     */
    public void logout(final Principal principal) {
        throw new IllegalStateException("Not implemented");
    }

    /**
     * Returns the authentication service configuration
     * @return the authentication service configuration
     */
    protected AuthServiceConfig getConfig() {
        return config;
    }
}
