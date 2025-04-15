package com.hotelmanagementsystem.indentity_service.repository;

import com.hotelmanagementsystem.indentity_service.entity.KhachHang;
import com.hotelmanagementsystem.indentity_service.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
    Optional<KhachHang> findByTaiKhoan(TaiKhoan taiKhoan);
}
