/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi2;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Seleksi2 {

    /**
     * @param args the command line arguments
     */
    static int hitung(int nilai){
        int bayar=30000;
        if(nilai>450){
            bayar=bayar;
            
        }
        if(nilai>1300){
            bayar=bayar+9000;
            
        }
            if(nilai>1500){
            bayar=bayar+15000;
            
        }

        return bayar;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int id[]={1,2,3,4};
        String namaPelanggan[]={"Galuh", "Indro", "Jedi", "Kanu"};
        String namaRumah[]={"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        Scanner object = new Scanner(System.in);
        System.out.println("Masukan ID Pelanggan");
        
        String idin=object.nextLine();
        int iid=Integer.valueOf(idin);
        System.out.println("Masukan jumlah tagihan");
        String tagih = object.nextLine();
        int itagih = Integer.valueOf(tagih);
        
        if(itagih<450){
            itagih=30000;
        }
        else {
            itagih=hitung(itagih);
        }
        itagih=itagih+13000;

        System.out.println("Print out tagihan");
        System.out.println("ID\t:"+idin);
        System.out.println("Nama\t:"+namaPelanggan[iid-1]);
        System.out.println("Alamat\t:"+namaRumah[iid-1]);
        System.out.println("Tagihan\t:Rp."+itagih+",.");
        }
    }
    