package com.example.user_profile_api.service;

import com.example.user_profile_api.model.UserProfile;
import com.example.user_profile_api.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public UserProfile createUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public Optional<UserProfile> getUserProfileById(Long id) {
        return userProfileRepository.findById(id);
    }

    public UserProfile updateUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public void deleteUserProfile(Long id) {
        userProfileRepository.deleteById(id);
    }

    public List<UserProfile> getAllUserProfiles() {
        return userProfileRepository.findAll();
    }
}
