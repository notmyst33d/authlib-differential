package com.mojang.authlib.yggdrasil.response;

import com.mojang.authlib.GameProfile;

/* loaded from: authlib-3.3.39.jar:com/mojang/authlib/yggdrasil/response/AuthenticationResponse.class */
public class AuthenticationResponse extends Response {
    private String accessToken;
    private String clientToken;
    private GameProfile selectedProfile;
    private GameProfile[] availableProfiles;
    private User user;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public GameProfile[] getAvailableProfiles() {
        return this.availableProfiles;
    }

    public GameProfile getSelectedProfile() {
        return this.selectedProfile;
    }

    public User getUser() {
        return this.user;
    }
}
