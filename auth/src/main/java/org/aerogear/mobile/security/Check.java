package org.aerogear.mobile.security;

import org.aerogear.mobile.security.checks.RootedCheck;

public enum Check {
    /**
     *  Detect whether the device is rooted.
<<<<<<< HEAD
<<<<<<< HEAD
=======
     *
     * @return <code>true</code> if the device is rooted.
>>>>>>> AEROGEAR-2174 Initial interface and class implementation
=======
>>>>>>> AEROGEAR-2174 Enable metrics to be sent
     */
    IS_ROOTED(new RootedCheck());

    private SecurityCheck check;

    Check(SecurityCheck check) {
        this.check = check;
    }

    /**
     * Return the {@link SecurityCheck} implementation for this check.
     *
     * @return
     */
    public SecurityCheck getSecurityCheck() {
        return check;
    }
}
