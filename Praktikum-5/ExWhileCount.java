public class ExWhileCount {

    public static void main(String [] args){
        int count=1;
        int i=0; while (i<9){
            int j=0;
            while (j<i+i){
                System.out.print(count); j++;
            }
            count++; System.out.println(); i++;
        }
    }
}

// program akan berjalan