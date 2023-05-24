/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pt2;

/**
 *
 * @author Neysaa
 */
public class Main {

    public static void main(String[] args) {
        try {
            Tampilan gatau = new Tampilan();
            gatau.Tampilan();
            gatau.Akhiran();
        } catch (Exception e) {
            System.out.println("Salah Input");
        }
    }
}
