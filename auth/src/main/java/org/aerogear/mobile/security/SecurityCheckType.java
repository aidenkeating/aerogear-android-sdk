package org.aerogear.mobile.security;

import org.aerogear.mobile.security.checks.OsVersionCheck;
import org.aerogear.mobile.security.checks.RootedCheck;

public enum SecurityCheckType {
    /**
     *  Detect whether the device is rooted.
     */
    IS_ROOTED(new RootedCheck()), IS_LATEST_VERSIN(new OsVersionCheck());

    private SecurityCheck check;

    SecurityCheckType(SecurityCheck check) {
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
