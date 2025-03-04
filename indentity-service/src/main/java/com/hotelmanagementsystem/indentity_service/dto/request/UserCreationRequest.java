package com.hotelmanagementsystem.indentity_service.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserCreationRequest {
    @Column(unique = true, nullable = false)
    private String username; // Tên đăng nhập

    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Pattern(regexp = ".*[a-zA-Z].*", message = "Password must contain at least one letter")
    @Column(nullable = false)
    private String passwordHash; // Mật khẩu đã hash (bcrypt)

    @Column(nullable = false)
    private Boolean isActive = true; // Tài khoản có đang hoạt động không

    @Column(nullable = false)
    private String fullName; // Họ tên đầy đủ

    @Column(nullable = false, unique = true)
    private String email; // Email đăng ký

    private String phoneNumber; // Số điện thoại

    private String avatarUrl; // Ảnh đại diện
}
