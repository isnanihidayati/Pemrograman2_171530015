public class Invest {
    public static void main(String[] args){
        float total = 14000;
        System.out.println("Original investment: $" + total);

        //Increases by 40 percent the first year total = total + (total * .4F)
        total = total + (total * .4F);
        System.out.println("Increases by 40 percent the first year total: $" + total);

        //Loses $1,500 the second year total = total + 1500F
        total = total + 1500F;
        System.out.println("Loses $1,500 the second year total: $ " + total);

       //Increases by 12 percent the third year total = total + (total * .12F)
       total = (total * .12F);
       System.out.println("Increases by 12 percent the third year total: $" + total);
    }
}