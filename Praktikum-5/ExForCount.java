public class ExForCount {

    public static void main(String[] args){
        int count = 1;
        for(int i=0; i<9; i++){
            for (int j=0; j<i+i; j++){
                System.out.print(count);
            }
            count++; System.out.println();
        }
    }
}

/* Analisa sintak :
    1. Pada baris ke-5 for dijalankan 9 kali
    2. Pada baris ke-6 for dijalankan hanya sekali
*/