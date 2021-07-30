/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anxiety;



import javax.swing.JFrame;

/**
 *
 * @author Wellington
 */
public class Decision_Class extends JFrame{
    
    Anxiety_Window1 dw = new Anxiety_Window1();
    Anxiety_Window2 dw2 = new Anxiety_Window2();
    Anxiety_Window3 dw3 = new Anxiety_Window3();
    Anxiety_Window4 dw4 = new Anxiety_Window4();
    Anxiety_Window5 dw5 = new Anxiety_Window5();
    Anxiety_Window6 dw6 = new Anxiety_Window6();
    Anxiety_Window7 dw7 = new Anxiety_Window7();
    Anxiety_Window8 dw8 = new Anxiety_Window8();
    Anxiety_Window9 dw9 = new Anxiety_Window9();
    Anxiety_Window10 dw10 = new Anxiety_Window10();
    AN_Never DN = new AN_Never();
    AN_SOTT DS = new AN_SOTT();
    AN_MOTT DM = new AN_MOTT();
    AN_AOTT DA = new AN_AOTT();
    
    String d1 = dw.btn1; // Never
    String d2 = dw.btn2; // SOTT
    String d3 = dw.btn3; // MOTT
    String d4 = dw.btn4; // AOTT

    String d5 = dw2.btn1;
    String d6 = dw2.btn2;
    String d7 = dw2.btn3;
    String d8 = dw2.btn4;
    
    String d9 = dw3.btn1; // Never
    String d10 = dw3.btn2; // SOTT
    String d11 = dw3.btn3; // MOTT
    String d12 = dw3.btn4; // AOTT

    String d13 = dw4.btn1;
    String d14 = dw4.btn2;
    String d15 = dw4.btn3;
    String d16 = dw4.btn4;
    
    String d17 = dw5.btn1; // Never
    String d18 = dw5.btn2; // SOTT
    String d19 = dw5.btn3; // MOTT
    String d20 = dw5.btn4; // AOTT

    String d21 = dw6.btn1;
    String d22 = dw6.btn2;
    String d23 = dw6.btn3;
    String d24 = dw6.btn4;
    
    String d25 = dw7.btn1; // Never
    String d26 = dw7.btn2; // SOTT
    String d27 = dw7.btn3; // MOTT
    String d28 = dw7.btn4; // AOTT

    String d29 = dw8.btn1;
    String d30 = dw8.btn2;
    String d31 = dw8.btn3;
    String d32 = dw8.btn4;
    
    String d33 = dw9.btn1; // Never
    String d34 = dw9.btn2; // SOTT
    String d35 = dw9.btn3; // MOTT
    String d36 = dw9.btn4; // AOTT

    String d37 = dw10.btn1;
    String d38 = dw10.btn2;
    String d39 = dw10.btn3;
    String d40 = dw10.btn4;
 
    
    public void getDecision(){
        try{
         if(d1.equals("Never") && d5.equals("Never")  && d9.equals("Never")  && d13.equals("Never") && d17.equals("Never") 
            && d21.equals("Never")  && d25.equals("Never")  && d37.equals("Never")){
            DN.setVisible(true);
            dw10.setVisible(false);
            
        }
        else if(d1.equals("Never") && d6.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d37.equals("Never")){
                DN.setVisible(true);
                dw10.setVisible(false);
            
        }
        else if(d4.equals("AOTT") && d6.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DS.setVisible(true);
                dw10.setVisible(false);
            
        }
        
        else if(d2.equals("SOTT") && d6.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d20.equals("AOTT") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DM.setVisible(true);
                dw10.setVisible(false);
            
        }
         
        else if(d4.equals("AOTT") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d20.equals("AOTT") 
                && d23.equals("MOTT")  && d28.equals("AOTT")  && d40.equals("AOTT")){
                DA.setVisible(true);
                dw10.setVisible(false);
            
        }
         
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
 
    
    public void getDecision2(){
        try{
         if(d1.equals("Never") && d6.equals("SOTT")  && d10.equals("SOTT")  && d14.equals("SOTT") && d26.equals("SOTT") 
            && d30.equals("SOTT")  && d34.equals("SOTT")  && d38.equals("SOTT")){
            DS.setVisible(true);
            dw10.setVisible(false);
            
        }
        else if(d1.equals("Never") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d37.equals("Never")){
                DN.setVisible(true);
                dw10.setVisible(false);
            
        }

        else if(d4.equals("AOTT") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d20.equals("AOTT") 
                && d23.equals("MOTT")  && d28.equals("AOTT")  && d40.equals("AOTT")){
                DA.setVisible(true);
                dw10.setVisible(false);
            
        }
        
        else if(d4.equals("AOTT") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DS.setVisible(true);
                dw10.setVisible(false);
            
        }
        
        else if(d1.equals("Never") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d20.equals("AOTT") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DM.setVisible(true);
                dw10.setVisible(false);
            
        }

        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void getDecision3(){
        try{
         if(d3.equals("MOTT") && d7.equals("MOTT")  && d11.equals("MOTT")  && d15.equals("MOTT") && d19.equals("MOTT") 
            && d27.equals("MOTT")  && d36.equals("AOTT")  && d40.equals("AOTT")){
            DM.setVisible(true);
            dw10.setVisible(false);
            
        }
         
        else if(d2.equals("SOTT") && d6.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d20.equals("AOTT") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DM.setVisible(true);
                dw10.setVisible(false);
            
        }
        else if(d1.equals("Never") && d6.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d37.equals("Never")){
                DN.setVisible(true);
                dw10.setVisible(false);
            
        }
        else if(d4.equals("AOTT") && d6.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DS.setVisible(true);
                dw10.setVisible(false);
            
        }
        

         

         
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
 
    
    public void getDecision4(){
        try{
        if(d4.equals("AOTT") && d6.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d20.equals("AOTT") 
                && d23.equals("MOTT")  && d28.equals("AOTT")  && d40.equals("AOTT")){
                DA.setVisible(true);
                dw10.setVisible(false);
            
        }
        
        else if(d1.equals("Never") && d6.equals("SOTT")  && d10.equals("SOTT")  && d14.equals("SOTT") && d26.equals("SOTT") 
            && d30.equals("SOTT")  && d34.equals("SOTT")  && d38.equals("SOTT")){
            DS.setVisible(true);
            dw10.setVisible(false);
            
        }
        else if(d1.equals("Never") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d37.equals("Never")){
                DN.setVisible(true);
                dw10.setVisible(false);
            
        }


        
        else if(d4.equals("AOTT") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d17.equals("Never") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DS.setVisible(true);
                dw10.setVisible(false);
            
        }
        
        else if(d1.equals("Never") && d5.equals("SOTT")  && d12.equals("AOTT")  && d13.equals("Never") && d20.equals("AOTT") 
                && d21.equals("Never")  && d26.equals("SOTT")  && d40.equals("AOTT")){
                DM.setVisible(true);
                dw10.setVisible(false);
            
        }

        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
    

    
}
