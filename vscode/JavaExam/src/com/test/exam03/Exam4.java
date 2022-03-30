package com.test.exam03;

public class Exam4 {

    public static void main(String[] args) {
        
        int rank = 1 ;
        char medalcolor;

        switch(rank){
             case 1 : medalcolor = 'G';
                      break;

            case 2 : medalcolor = 'S';
                     break;

            default: medalcolor = 'A';


        }
        System.out.println(rank+ " 등의 메달 색은" + medalcolor + "입니다.");
        

    }
    
}
