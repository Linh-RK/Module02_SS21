package ex02;

public class Sum {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                int sum = 0;
                for(int i=1;i<=1000;i++){
//                    System.out.println(i);
                    sum+=i;
                    if(i==10){
                        System.out.println("End");
                    }
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                }
                System.out.println(sum);
            }
        };
        t1.start();
    }
}
