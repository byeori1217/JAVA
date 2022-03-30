package Thread.com.test;

public class ThreadExam3 {

    public static void main(String[] args) {
        
        new Thread (new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<30; i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("Thread 1이 실행");
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                  
                }

            }

        }).start();;

        for(int i=0; i<30; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread 2가 실행");
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            
        }
    }
    
}
