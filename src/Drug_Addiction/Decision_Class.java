/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug_Addiction;

import javax.swing.JFrame;

/**
 *
 * @author Wellington
 */
public class Decision_Class extends JFrame{
    // Decision based on question 1, 2, 7, 8:
    String overallD;
    DA_Window1 dw = new DA_Window1();
    DA_Window2 dw2 = new DA_Window2();
//    DA_Window3 dw3 = new DA_Window3();
//    DA_Window4 dw4 = new DA_Window4();
//    DA_Window5 dw5 = new DA_Window5();
//    DA_Window6 dw6 = new DA_Window6();
    DA_Window7 dw7 = new DA_Window7();
    DA_Window8 dw8 = new DA_Window8();
    DA_TRUE DT = new DA_TRUE();
    DA_FALSE DF = new DA_FALSE();
    
    String d1 = dw.btn1; // For True
    String d2 = dw.btn2; // For False
    
    String d3 = dw2.btn1;
    String d4 = dw2.btn2;

    String d5 = dw7.btn1;
    String d6 = dw7.btn2;

    String d7 = dw8.btn1;
    String d8 = dw8.btn2;
 
    



    
    public void getDecision(){
        try{
         if(d1.equals("T") && d3.equals("T")  && d5.equals("T")  && d7.equals("T")){
            DT.setVisible(true);
            dw8.setVisible(false);
            
        }
        else if(d2.equals("F") && d4.equals("F")  && d6.equals("F")  && d8.equals("F")){
            DF.setVisible(true);
            dw8.setVisible(false);
        }  
        if(d1.equals("T") && d4.equals("F")  && d5.equals("T")  && d8.equals("F")){
            DT.setVisible(true);
            dw8.setVisible(false);
            
        }
        else if(d2.equals("F") && d4.equals("F")  && d7.equals("T")  && d8.equals("F")){
            DF.setVisible(true);
            dw8.setVisible(false);
        } 
         
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
    
    public void getDecision2(){
        try{
            if(d2.equals("F") && d4.equals("F")  && d7.equals("T")  && d8.equals("F")){
                DF.setVisible(true);
                dw8.setVisible(false);
            }             
            else if(d1.equals("T") && d3.equals("T")  && d5.equals("T")  && d7.equals("T")){
                DT.setVisible(true);
                dw8.setVisible(false);

            }
            else if(d2.equals("F") && d4.equals("F")  && d6.equals("F")  && d8.equals("F")){
                DF.setVisible(true);
                dw8.setVisible(false);
            }  
            else if(d1.equals("T") && d4.equals("F")  && d5.equals("T")  && d8.equals("F")){
                DT.setVisible(true);
                dw8.setVisible(false);

            }

         
        }
        catch(Exception e){
            System.out.println("Error");
        }

    }
    

    
}
