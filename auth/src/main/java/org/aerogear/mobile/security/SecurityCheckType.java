package org.aerogear.mobile.security;

import org.aerogear.mobile.security.checks.DeveloperModeCheck;
import org.aerogear.mobile.security.checks.RootedCheck;

public enum SecurityCheckType {
    /**
     *  Detect whether the device is rooted.
     *
     * @return <code>true</code> if the device is rooted.
     */
    IS_ROOTED(new RootedCheck()),
    /**
     * Detect if developer mode is enabled in the device.
     *
     * @return <code>true</code> if developer mode is enabled in the device.
     */
    IS_DEVELOPER_MODE(new DeveloperModeCheck());

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
