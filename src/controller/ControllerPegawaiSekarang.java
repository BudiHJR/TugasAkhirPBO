/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelPegawai;
import model.ModelPegawaiKeluar;
import model.ModelPegawaiSekarang;
import util.Koneksi;

/**
 *
 * @author ASUS
 */
public class ControllerPegawaiSekarang {
    Koneksi koneksi = new Koneksi();
    
    public void simpanDataSekarang(ModelPegawaiSekarang mps){
        koneksi.KoneksiDatabase();
        String query = "insert into tbl_pegawai2 values ('"+mps.getNama()+"', '"+mps.getJabatan()+"')";
        try {
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eror bro : "+e);
        }
    }
    
     public void hapusData(ModelPegawaiSekarang mps) {
    try {
            koneksi.KoneksiDatabase();
            String query = "DELETE FROM `db_pegawai`.`tbl_pegawai2` WHERE `Nama` = '"+mps.getNama()+"'";
            koneksi.state.executeUpdate(query);
            //koneksi.connect.close();
        } catch (SQLException e) {
            System.err.println("Error : "+e);
        }
    }
     
    public void ubahDataJabatan(ModelPegawaiSekarang mps){
        koneksi.KoneksiDatabase();
        try {
            String nama = mps.getNama();
            String jabatan = mps.getJabatan();
            String Query = "UPDATE tbl_pegawai2 SET JabatanSekarang=('"+ jabatan +"') WHERE Nama=('"+ nama +"')";
            koneksi.state.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah : "+e);
        }
    }
}
