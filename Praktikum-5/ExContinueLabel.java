public class ExContinueLabel {

    public static void main(String[] args){
        outerLoop:
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                //message1
                System.out.println("Inside for(j) loop");
                if(j==2) continue outerLoop;
            }
            //message2
            System.out.println("Inside for(i) loop");
        }
    }
}

/* Analisa sintak :
    1. perulangan akan berjalan 17 kali
    2. baris ke 12 tidak tercetak
    3. jika kondisi if bernilai true maka statement continue label outerLoop akan dijalankan,
        jika bernilai false maka j++ akan dijalankan
*/