public class Main {
    public static void main(String[] args) {
        int account = 100;
        int add = Integer.parseInt(args[0]); //to use this with a CL argument instead of changing the variable and recompiling
        int bonus = 0;
        if (add > 1000) {
            bonus = add / 100;
        }
        //account = account + add + bonus; //kinda irrelevant
        System.out.println(bonus);
    }


}
