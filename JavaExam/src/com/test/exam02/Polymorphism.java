package com.test.exam02;

class Family{

    void hello() { System.out.println("인사합시다.");}

}

class KimFamily extends Family{
    void hello(){ System.out.println("김선생님 안녕하세요.");}
    void dinner(){ System.out.println("식사나 한번 하시죠");}
    void drink(){ System.out.println("커피 한잔..");}

}

class ParkFamily extends Family{
    void hello(){ System.out.println("박선생님 안녕하세요?");}
    void fishing(){System.out.println("낚시나 같이 하시죠");}
}

public class Polymorphism {
    public static void main(String[] args) {
        
        Family KimF = new KimFamily();
        KimF.hello();

        Family ParkF = new ParkFamily();
        ParkF.hello();
    }
    



}
