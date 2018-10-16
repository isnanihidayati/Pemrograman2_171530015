import java.io.*;

public class Task1 {

    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        String kode[];
        String nama[];
        String jumlah[];

        do{
            System.out.println("Masukkan kode barang : ");
                kode = dataIn.readLine();
            System.out.println("Masukkan nama barang : ");
                nama = dataIn.readLine();
            System.out.println("Masukkan jumlah barang : ");
                jumlah = dataIn.readLine();
        }while()
    }
}