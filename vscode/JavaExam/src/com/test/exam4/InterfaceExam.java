package com.test.exam4;

import com.test.exam4.ATeam.BTeam;

interface Sales {

    public void manager();
    public void goal();
    public void product();

}

class ATeam implements Sales{

    @Override
    public void manager() {
        System.out.println("A팀장입니다. 열심히 하겠습니다.");
        
    }

    @Override
    public void goal() {
        System.out.println("A팀은 올해 70억 달성하겠습니다.");
        
    }

    @Override
    public void product() {
        System.out.println("A팀은 TV를 판매하겠습니다.");

        
    }

    
class BTeam implements Sales {

    @Override
    public void manager() {
     System.out.println("B팀 팀장입니다.");

        
    }

    @Override
    public void goal() {
       System.out.println("B팀은 올해 100억 달성하겠습니다.");

        
    }

    @Override
    public void product() {
        System.out.println("B팀은 냉장고를 팔겠습니다.");
        
    }


}



}
public class InterfaceExam {

    public static void main(String[] args) {
        
        ATeam aSalePlan = new ATeam();
        aSalePlan.manager();
        aSalePlan.goal();
        aSalePlan.product();

        
    }
    
}
