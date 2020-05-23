package com.example.insightsecurity.ui.login;

import androidx.annotation.Nullable;

/**
 * Data validation state of the login form.
 */
class LoginFormState {
    @Nullable
    private Integer organizationcode;
    private boolean isDataValid;

    LoginFormState(@Nullable Integer organizationcode) {
        this.organizationcode = organizationcode;
        this.isDataValid = false;
    }

    LoginFormState(boolean isDataValid) {
        this.organizationcode = null;
        this.isDataValid = isDataValid;
    }

    @Nullable
    Integer getUsernameError() {
        return organizationcode;
    }

    boolean isDataValid() {
        return isDataValid;
    }
}
