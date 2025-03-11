/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmucs426;  // Xóa ".model"

import com.cmucs426.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("123", "example@example.com");
        System.out.println("User email: " + user.getEmail());
    }
}


