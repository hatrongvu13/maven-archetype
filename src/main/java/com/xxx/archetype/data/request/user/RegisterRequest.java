package com.xxx.archetype.data.request.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record RegisterRequest(@NotBlank(message = "Username is required")
                              String username,
                              @NotBlank(message = "Password is required")
                              String password,
                              @NotBlank(message = "Email is required")
                              @Email(message = "Email wrong")
                              String email,
                              String phone,
                              String fullName) {
}
