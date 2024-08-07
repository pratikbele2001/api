package com.example.user_profile_api.repository;

import com.example.user_profile_api.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
