/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ashispaint;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Ashis Kumar Chanda
 */

 class Abo implements ActionListener
  {
         public void actionPerformed(ActionEvent e)
         {
             String s;
             s="                          This Program is a Assignement in Java class\n";
             s+="Trying to make a Notepad Like Windows7 and add some new Features\n\n";
             s+="                                      Asknowleagement:\n";
             s+="To my honourable Teachers and Friends who help me to give new\n";
             s+="                                                   ideas\n\n\n";
             s+="   Made by:\n";
             s+="Ashis kumar chanda\n";
             s+="16th Batch\n";
             s+="CSE, University of Dhaka\n\n";
             s+="Contact: ashisdu@yahoo.com\n";
             s+="Visit at: www.dreamerashis.blogspot.com\n";

             JOptionPane.showMessageDialog(null, s,"About . . .",1);
             //   you can give int value 1 at last to see OK button
         }
  }
 class Help implements ActionListener
 {
         public void actionPerformed(ActionEvent e)
         {
             String s;
             s="Paint is a basic drawing program and it's most commonly\n";
             s+="used to view or edit picture. But it is not an actuall \n";
             s+="paint program. So, you can't save or open new paint program\n";

             JOptionPane.showMessageDialog( null, s,"HELP",1);
             //   you can give int value 1 at last to see OK button

 
              }
     }


  class Exit implements ActionListener
  {
            public void actionPerformed( ActionEvent event )
             {
                int check=0;
                //check= JOptionPane.showConfirmDialog(rootPane,"Are you sure to Quite ?",2);
                check =JOptionPane.showConfirmDialog(null,"Are you sure to quite?", "Caution",0);
                // ******  --> if u write this class at main code u can use rootPane
                // ******  --> alternatively for null  keyword

                System.out.println(check);
                if( check == 0)
                    System.exit( 0 ); // exit application
              } // end method actionPerformed

    }
