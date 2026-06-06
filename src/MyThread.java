public class MyThread extends Thread {
    public void run() {
        System.out.println("This is a thread");
        int firstNumber = 0,secondNumber = 1,sum = 0;
        System.out.println(firstNumber+"\n"+secondNumber);
        for(int i = 0; i<10;i++) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.println(sum);
        }
    }


}
