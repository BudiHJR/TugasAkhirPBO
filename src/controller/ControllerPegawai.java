/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelPegawai;
import util.Koneksi;

/**
 *
 * @author ASUS
 */
public class ControllerPegawai {
    Koneksi koneksi = new Koneksi();
    
    public void simpanData(ModelPegawai mod){
        koneksi.KoneksiDatabase();
        String query = "insert into tbl_pegawai(Nama,TempatLahir,TanggalLahir,JenisKelamin,Alamat,Nope,Jabatan,PendidikanTerakhir,TanggalMasuk) values ('"+mod.getNama()+"','"+mod.getTptlahir()+"','"+mod.getTgllahir()+"','"+mod.getJkelamin()+"','"+mod.getAlamat()+"','"+mod.getNope()+"','"+mod.getJabatan()+"','"+mod.getPendidikan()+"','"+mod.getTglmasuk()+"')";
        try {
            koneksi.state.executeUpdate(query);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }
    }
    
    public void hapusData(ModelPegawai mod) {
    try {
            koneksi.KoneksiDatabase();
            String query = "delete from tbl_pegawai where id=('"+mod.getId()+"')";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            //koneksi.connect.close();
        } catch (SQLException e) {
            System.err.println("Error : "+e);
            JOptionPane.showMessageDialog(null, "Data Tidak terhapus");
        }
    }
    
    public void ubahData(ModelPegawai mod) {
         koneksi.KoneksiDatabase();
         try {
            int id = mod.getId();
            String nama = mod.getNama();
            String tptlahir = mod.getTptlahir();
            String tgllahir = mod.getTptlahir();
            String jkelamin = mod.getJkelamin();
            String alamat = mod.getAlamat();
            String nope = mod.getNope();
            String jabatan = mod.getJabatan();
            String pendidikan = mod.getPendidikan();
            String tglmasuk = mod.getTglmasuk();

            String query = "update tbl_pegawai "
                    + "set Nama=('" + nama + "'),"
                    + "TempatLahir=('"+ tptlahir +"'),"
                    + "TanggalLahir=('"+ tgllahir +"'),"
                    + "JenisKelamin=('"+ jkelamin +"'),"
                    + "Alamat=('" +alamat +"'),"
                    + "Nope=('"+ nope +"'),"
                    + "Jabatan=('"+ jabatan +"'),"
                    + "PendidikanTerakhir=('"+ pendidikan +"'),"
                    + "TanggalMasuk=('"+ tglmasuk +"')"
                    + "where ID=('" + id + "')";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } catch (SQLException e) {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data Tidak terubah");
        }
    }
}
