package com.test.exam03;

public class Exam1 {
    
   



public static void main(String[] args) {
    int score = 27;
    char grade;

    if ( score>= 90) { grade = 'A' ; System.out.println("A");}
    else if(score>=80) { grade = 'B'; System.out.println("B");}
    else if(score>=70) { grade = 'C'; System.out.println("C");}
    else  { grade = 'D'; System.out.println("D");}
    System.out.println("성적은" + grade + "입니다.");

}



}
