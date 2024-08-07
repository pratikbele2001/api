package com.example.user_profile_api.controller;

import com.example.user_profile_api.model.UserProfile;
import com.example.user_profile_api.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user-profiles")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping
    public UserProfile createUserProfile(@RequestBody UserProfile userProfile) {
        return userProfileService.createUserProfile(userProfile);
    }

    @GetMapping("/{id}")
    public Optional<UserProfile> getUserProfileById(@PathVariable Long id) {
        return userProfileService.getUserProfileById(id);
    }

    @PutMapping("/{id}")
    public UserProfile updateUserProfile(@PathVariable Long id, @RequestBody UserProfile userProfile) {
        userProfile.setId(id);
        return userProfileService.updateUserProfile(userProfile);
    }

    @DeleteMapping("/{id}")
    public void deleteUserProfile(@PathVariable Long id) {
        userProfileService.deleteUserProfile(id);
    }

    @GetMapping
    public List<UserProfile> getAllUserProfiles() {
        return userProfileService.getAllUserProfiles();
    }
}

