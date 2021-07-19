package cs.software.demo.security.oauth2.user;
import cs.software.demo.custom_exceptions.OAuth2AuthenticationProcessingException;
import cs.software.demo.security.oauth2.user.GoogleOAuth2UserInfo;
import cs.software.demo.security.oauth2.user.OAuth2UserInfo;

import java.util.Map;

import static cs.software.demo.data.AuthProvider.google;

public class OAuth2UserInfoFactory {
    private OAuth2UserInfoFactory() {
        throw new IllegalStateException("Utility class");
    }
    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Login with this provider is not supported yet");
        }
    }
}
