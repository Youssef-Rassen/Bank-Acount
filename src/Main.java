public class Main {
    public static void main(String[] args) {
        // 2 withdraw amounts in the same time
    Thread thread1 = new Thread(new Runnable() {
        //1st Thread
        @Override
        public void run() {
            for(int i =0;i<4;i++){
                User.Withdraw(User.account,200);
            }
        }
    });
        Thread thread2 = new Thread(new Runnable() {
            //1st Thread
            @Override
            public void run() {
                for(int i =0;i<4;i++){
                    User.Withdraw(User.account,200);
                }
            }
        });
        System.out.println(" Your account balance is: " + User.account.getBalance());
        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
