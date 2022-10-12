package com.example.awsimageupload.datastore;

import com.example.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("7130d07e-5197-45be-8612-f75f67aebda5"), "jabetjhones",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("0ea87003-23b8-42a0-88f8-898a2fe6d34e"), "antonioJunior",null));

    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }


}
