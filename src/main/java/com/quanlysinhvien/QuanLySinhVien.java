/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.quanlysinhvien;

import java.sql.Connection;

public class QuanLySinhVien {

    public static void main(String[] args) {

        Connection conn = KetNoiSQL.ketNoi();

        if (conn != null) {
            System.out.println("JAVA DA KET NOI DATABASE!");
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

