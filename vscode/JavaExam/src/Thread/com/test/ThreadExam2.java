package Thread.com.test;

import java.security.spec.ECFieldF2m;

class ExamClass2 extends Thread{

    @Override
    public void run(){
        try {
            for(int i=0; i<30; i++)
            Thread.sleep(1000);
            System.out.println("Thread 1이 실행");

        } catch (InterruptedException e) {
       
            e.printStackTrace();
        }
        
    }
}   

public class ThreadExam2 {

    public static void main(String[] args) throws InterruptedException {
        ExamClass2 examClass2 = new ExamClass2();
        examClass2.start();
       
        for(int i=0; i<30; i++){
            Thread.sleep(1000);
            System.out.println("Thread 2가 실행");
            
        
        }
       
        
    }
    
}
