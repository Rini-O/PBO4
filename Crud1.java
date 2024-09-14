/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keempat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer_user
 */
public class Crud1 {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt = null;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/Pbo4";
    String user = "postgres";
    String password = "rini123tok";
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(inputStreamReader);

    public void tambah() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(koneksi, user, password);
            conn.setAutoCommit(false);

            String sql = "INSERT INTO Mahasiswa VALUES(?,?,?)";
            pstmt = conn.prepareStatement(sql);

            boolean selesai = false;
            while (!selesai) {
                System.out.println("MASUKKAN NIM MAHASISWA ");
                System.out.print("NIM : ");
                String Nim = input.readLine().trim();
                System.out.print("Nama : ");
                String nama = input.readLine().trim();
                System.out.print("Program Studi : ");
                String programstudi = input.readLine().trim();

                pstmt.setLong(1, Long.parseLong(Nim));
                pstmt.setString(2, nama);
                pstmt.setString(3, programstudi);

                pstmt.executeUpdate();

                System.out.print("Apakah data yang dimasukkan sudah benar ? (iya/tidak): ");
                String pilihan = input.readLine().trim();
                if (!pilihan.equalsIgnoreCase("iya")) {
                    selesai = true;
                }
            }

            conn.commit();
            pstmt.close();
            conn.close();
            System.out.println("succes");
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            System.out.println("Terjadi kesalahan saat melakukan operasi insert dalam loop.");
            ex.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                System.out.println("Gagal melakukan rollback transaksi.");
                e.printStackTrace();
            }
        }
    }

    public void tampil() {
        try {
            // TODO code application logi
            Class.forName(driver);
            String sql = "SELECT * FROM Mahasiswa";
            conn = DriverManager.getConnection(koneksi, user, password);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                ResultSet rs;
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(String.valueOf(rs.getObject(1)) + " | " + String.valueOf(rs.getObject(2)) + " | "
                            + "" + String.valueOf(rs.getObject(3)));
                }
                conn.close();
            }

            stmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crud1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Crud1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hapus() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(koneksi, user, password);

            // Prompt the user for the dogtag of the record they want to delete
            System.out.print("Masukkan NIM  yang akan dihapus : ");
            String dogtagToDelete = input.readLine().trim();

            // Delete the record from the database
            String deleteSql = "DELETE FROM Mahasiswa WHERE Nim = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setLong(1, Long.parseLong(dogtagToDelete));
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Nim " + dogtagToDelete + " Penghapusan berhasil!");
            } else {
                System.out.println("Nim" + dogtagToDelete + " tidak ada.");
            }

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(Crud1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        try {
            Class.forName(driver);
            String sql = "UPDATE Mahasiswa SET nama = ?, programstudi =? WHERE Nim = ?";
            conn = DriverManager.getConnection(koneksi, user, password);
            pstmt = conn.prepareStatement(sql);

            System.out.print("Masukkan Nim yang akan diupdate: ");
            String Nim = input.readLine().trim();
            System.out.print("Nama Nim baru: ");
            String namaMahasiswabaru = input.readLine().trim();
            System.out.print("Program  baru: ");
            String programStudibaru = input.readLine().trim();

            pstmt.setString(1, namaMahasiswabaru);
            pstmt.setString(2, programStudibaru);

            pstmt.setLong(3, Long.parseLong(Nim));

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data berhasil diupdate.");
            } else {
                System.out.println("Data tidak ditemukan.");
            }

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(Crud1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void menu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Update Data");
        System.out.println("0. exit");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    tambah();
                    break;
                case 2:
                    tampil();
                    break;
                case 3:
                    hapus();
                    break;
                case 4:
                    update();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } catch (IOException ex) {
            Logger.getLogger(Crud1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new Crud1().menu();
    }

}
