package ex01;

public class CountTime {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i=1;i<=10;i++){
                    System.out.println(i);
                    if(i==10){
                        System.out.println("End");
                    }
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t1.start();
    }
}
