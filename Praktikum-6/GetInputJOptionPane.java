import javax.swing.JOptionPane;

public class GetInputJOptionPane {
    public static void main(String[] args){

        String nim = "", nama = "", tempat = "", tgllahir = "";
        
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");

        nim = JOptionPane.showInputDialog("Masukkan NIM Anda : ");

        tempat = JOptionPane.showInputDialog("Masukkan Tempat Lahir Anda : ");
       
        tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir Anda : ");
        
        String msg = "Selamat datang " + nama;
        JOptionPane.showMessageDialog(null, msg);
        
        String msh = "NIM     : " + nim;
        JOptionPane.showMessageDialog(null, msh);

        String msi = "Tempat Lahir : " + tempat;
        JOptionPane.showMessageDialog(null, msi);

        String msj = "Tanggal Lahir : " + tgllahir;
        JOptionPane.showMessageDialog(null, msj);
    }
}