public class fibonacci {
    public static void main(String[] args){

        System.out.print("0 1 ");

        fibo(0,1,15,2);

    }
    public static void fibo(int n1,int n2,int index,int count){
        if (count<index) {
            int newNumber = n1+ n2;
            System.out.print(newNumber + " ");
            fibo(n2,newNumber,index, ++count);

        }
    }
}

