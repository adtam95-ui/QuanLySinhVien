/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanlysinhvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiSQL {

    public static Connection ketNoi() {
        String url =
            "jdbc:sqlserver://localhost:1433;"
            + "databaseName=QuanLySinhVien;"
            + "integratedSecurity=true;"
            + "encrypt=true;"
            + "trustServerCertificate=true;";

        try {
            Connection conn =
                DriverManager.getConnection(url);

            System.out.println("Ket noi SQL thanh cong!");
            return conn;

        } catch (SQLException e) {
            System.out.println("Ket noi that bai!");
            System.out.println(e.getMessage());
            return null;
        }
    }
}

