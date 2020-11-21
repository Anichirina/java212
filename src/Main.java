public class Main {
    public static void main(String [] args) {
       int deposit = 110;
       int percent;
        if (deposit>1000) {
            percent = 1;
        }
        else {
            percent = 0;
        }
        int account = 100;
        int bonus = deposit * percent / 100;
        int result = deposit + account + bonus;
        System.out.println(result);
    }
   }
