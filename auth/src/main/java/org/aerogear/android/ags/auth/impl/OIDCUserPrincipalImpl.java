package org.aerogear.android.ags.auth.impl;

import org.aerogear.android.ags.auth.AbstractAuthenticator;
import org.aerogear.android.ags.auth.UserRole;
import org.aerogear.android.ags.auth.credentials.OIDCCredentials;

import java.util.Set;

public class OIDCUserPrincipalImpl extends UserPrincipalImpl {

    /**
     * Builds a new UserPrincipalImpl object
     *
     * @param username the username of the authenticated user
     * @param credentials the OIDC credentials of the user
     * @param email the email of the authenticated user
     * @param roles roles assigned to the user
     * @param authenticator the authenticator that authenticated this user
     */
    protected OIDCUserPrincipalImpl(final String username,
                             final OIDCCredentials credentials,
                             final String email,
                             final Set<UserRole> roles,
                             final AbstractAuthenticator authenticator) {
        super(username, credentials, email, roles, authenticator);
    }

    public static class Builder extends UserPrincipalImpl.Builder {
        public Builder() {
            super();
        }

        @Override
        public OIDCUserPrincipalImpl build() {
            return new OIDCUserPrincipalImpl(
                    this.username,
                    (OIDCCredentials) this.credentials,
                    this.email,
                    this.roles,
                    this.authenticator);
        }
    }

    public static Builder newUser() { return new Builder(); }
}
