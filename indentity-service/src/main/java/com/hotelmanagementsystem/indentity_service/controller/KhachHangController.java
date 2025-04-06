package com.hotelmanagementsystem.indentity_service.controller;

import com.hotelmanagementsystem.indentity_service.entity.KhachHang;
import com.hotelmanagementsystem.indentity_service.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/list")
    public ResponseEntity<List<KhachHang>> getAllKhachHang() {
        List<KhachHang> danhSachKhachHang = khachHangService.getAllKhachHang();
        return ResponseEntity.ok(danhSachKhachHang);
    }
}