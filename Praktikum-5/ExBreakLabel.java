public class ExBreakLabel {

    public static void main(String[] args){
        int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
        int searchNum = 5;
        boolean foundNum = false;
        searchLabel:
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(searchNum == numbers[i][j]){
                    foundNum = true;
                    break searchLabel;
                }
            }
        }
        if(foundNum){
            System.out.println(searchNum + "found!");
        }else{
            System.out.println(searchNum + "not found!");
        }
    }
}

/* Analisa sintak :
    1. perulangan akan berjalan 7 kali
    2. jika kondisi if terpenuhi, maka akan menjalankan statement break dan menghentikan perulangan
*/