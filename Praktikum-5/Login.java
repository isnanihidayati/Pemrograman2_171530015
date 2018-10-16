import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Login{
    public static void main (String[] args){

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String id_user="", pass="";

        while(true){
            System.out.print("Masukkan ID. User : ");

            try{
                id_user = dataIn.readLine();
            }catch( IOException e){
                System.out.println("Error!");
            }

            System.out.print("Masukkan Password : ");

            try{
                pass = dataIn.readLine();
            }catch( IOException e ){
                System.out.println("Error!");
            }

            if(id_user.equals("171530015") && pass.equals("mahasiswa123")){
                System.out.println("Selamat datang... " + id_user);
                break;
            }else if(id_user.equals("171530015") == false){
                System.out.println("ID. User salah");
            }else if(pass.equals("mahasiswa123") == false){
                System.out.println("Password salah");
            }
        }
    }
}