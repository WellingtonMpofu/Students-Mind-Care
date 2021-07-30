/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sexual_Addiction;


import javax.swing.JFrame;

/**
 *
 * @author Wellington
 */
public class Decision_Class extends JFrame{

    SA_Window1 dw = new SA_Window1();
    SA_Window2 dw2 = new SA_Window2();
    SA_Window3 dw3 = new SA_Window3();
    SA_Window4 dw4 = new SA_Window4();
    SA_Window5 dw5 = new SA_Window5();
    SA_Window6 dw6 = new SA_Window6();
    SA_Window7 dw7 = new SA_Window7();
    SA_Window8 dw8 = new SA_Window8();
    SA_Window9 dw9 = new SA_Window9();
    SA_Window10 dw10 = new SA_Window10();
    
    SA_YES DY = new SA_YES();
    SA_NO DN = new SA_NO();
    
    String d1 = dw.btn1; // For YES
    String d2 = dw.btn2; // For NO
    
    String d3 = dw2.btn1;
    String d4 = dw2.btn2;

    String d5 = dw7.btn1;
    String d6 = dw7.btn2;

    String d7 = dw8.btn1;
    String d8 = dw8.btn2;
    
    String d9 = dw9.btn1;
    String d10 = dw9.btn2;   
    
    String d11 = dw10.btn1;
    String d12 = dw10.btn2;
    



    
    public void getDecision(){
        try{
         if(d1.equals("Y") && d3.equals("Y")  && d5.equals("Y")  && d7.equals("Y")){
            DY.setVisible(true);
            dw10.setVisible(false);
            
        }
        else if(d2.equals("N") && d4.equals("N")  && d6.equals("N")  && d8.equals("N")){
            DN.setVisible(true);
            dw10.setVisible(false);
        }  
        if(d1.equals("Y") && d4.equals("N")  && d5.equals("Y")  && d8.equals("N")){
            DY.setVisible(true);
            dw10.setVisible(false);
            
        }
        else if(d2.equals("N") && d4.equals("N")  && d7.equals("N")  && d8.equals("N")){
            DN.setVisible(true);
            dw10.setVisible(false);
        } 
         
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
    
    public void getDecision2(){
        try{
            if(d2.equals("N") && d4.equals("N")  && d7.equals("Y")  && d8.equals("N")){
                DN.setVisible(true);
                dw10.setVisible(false);
            }             
            else if(d1.equals("Y") && d3.equals("N")  && d5.equals("Y")  && d7.equals("N")){
                DY.setVisible(true);
                dw10.setVisible(false);

            }
            else if(d2.equals("N") && d4.equals("N")  && d6.equals("N")  && d8.equals("N")){
                DN.setVisible(true);
                dw10.setVisible(false);
            }  
            else if(d1.equals("Y") && d4.equals("N")  && d5.equals("Y")  && d8.equals("N")){
                DY.setVisible(true);
                dw10.setVisible(false);

            }

         
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
    

    
}
