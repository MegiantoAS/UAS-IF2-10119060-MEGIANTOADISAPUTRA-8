/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119060.megiantoadisaputra.pkg8;

/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 */
public class Persegi implements BangunDatar 
{
    private int luas;
    private final int sisi;
    
    public Persegi(int sisi)
    {
        this.sisi = sisi;
    }
    
    public void hitungLuas()
    {
        luas = sisi * sisi;
        
        System.out.println("Luas Persegi : " + luas);
    }
}