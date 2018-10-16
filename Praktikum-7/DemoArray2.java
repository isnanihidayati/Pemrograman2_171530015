public class DemoArray2 {

    public static void main(String args[]){
        //Contoh program pencarian

        String names[] = {"Adi", "Aji", "Abbi", "Abdul", "Hasif"};
        String searchName = "Abbi";
        boolean foundName = false; //deklarasi varibale 
        for(int i=0; i<names.length; i++){ //perulangan
            if(names[i].equals(searchName)){ //jika nilai array ke [i] sama dgn nama yg dicari maka variabel
                foundName = true;
                break;
            }
        }
        if(foundName){
            System.out.println(searchName + "found!");
        }else{
            System.out.println(searchName + "not found!");
        }
    }
}

/* baris 10 : equalsIgnoreCase agar tdk case sensitive
                equals : case sensitive
*/