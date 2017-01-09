/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelPegawaiKeluar;
import model.ModelPegawaiSekarang;
import util.Koneksi;

/**
 *
 * @author ASUS
 */
public class ControllerPegawaiKeluar {
    String nama,jabatan,tglkeluar;

    Koneksi koneksi = new Koneksi();
    
    public void simpanDataSekarang(ModelPegawaiKeluar mpk){
        koneksi.KoneksiDatabase();
        String query = "insert into `db_pegawai`.`tbl_pegawai3` (`Nama`, `JabatanTerakhir`,`TanggalKeluar`) values ('"+mpk.getNama()+"', '"+mpk.getJabatan()+"','"+mpk.getTglKeluar()+"')";
        try {
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eror bro : "+e);
        }
    }
    
    
}
