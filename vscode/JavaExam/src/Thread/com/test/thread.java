package Thread.com.test;

class ExamClass implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<30; i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            System.out.println("Thread가 실행");

        }
        System.out.println("Thread가 실행");


    }
}


public class thread {

    public static void main(String[] args) throws InterruptedException {
        
        Thread thread = new Thread(new ExamClass());
        thread.start();

        for(int i=0; i<30; i++){
            Thread.sleep(1000);

        }
    }
    
}
