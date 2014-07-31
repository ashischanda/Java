
package ashispaint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class draw extends JPanel {

    int x, y,width,height,tempx,tempy,W,H;
    int flag=0,flagC=0;
    int pointcount=0;
    int index=0;
    private static String[] color={"red","blue","green","orange","yellow","cyan","megenta"};

    Point[] points=new Point[10000];

    draw(){

     }

    void drawpicture(){
        addMouseMotionListener(
                new MouseMotionAdapter(){
                    public void mouseDragged(MouseEvent event){


                if(pointcount<points.length&& (flag==1 || flag==6 || flag ==7 ) ){
                    points[pointcount]=event.getPoint();
                    pointcount++;
                     repaint();

                }

              // if(flag==1)
                //   repaint();
            }

        }

        );

      addMouseListener(
                new MouseAdapter(){
                public void mouseClicked(MouseEvent event){
                // if(flag==2||flag==3){
                //       width=0;
                //      height=0;
               // }
            }
            public void mouseReleased(MouseEvent event){
                
              //  checkForTriggerEvent( event ); // check for trigger
                
                if(flag!=1){
                width=W=event.getX();
                height=H=event.getY();
                System.out.println(W);
                System.out.println("hie d :"+H+" "+x+"   "+y);
                       width-=tempx;
                       height-=tempy;
                       repaint();

                }

            }
            public void mousePressed(MouseEvent event)
            {
               // checkForTriggerEvent( event ); 
                
                if(flag!=1){
                   x=event.getX();
                   y=event.getY();
                   tempx=x;
                   tempy=y;
               }
                
            }
          /*  For  pop up
            private void checkForTriggerEvent( MouseEvent event )
            {
               if ( event.isPopupTrigger() )
                  mainpart.show(
                     event.getComponent(), event.getX(), event.getY() );
            } // end method checkForTriggerEvent
            
            */

        });
   }

    //     is it neccessary
    // public Dimension getPreferredSize() {
    //        return new Dimension(400,400);
    //    }


    public void paintComponent(Graphics g){
       if(flagC==0)
        g.setColor(Color.black);
       if(flagC==1)
           g.setColor(Color.blue);
       if(flagC==2)
           g.setColor(Color.green);
        if(flagC==3)
           g.setColor(Color.orange);
        if(flagC==4)
           g.setColor(Color.yellow);
        if(flagC==5)
           g.setColor(Color.cyan);
        if(flagC==6)
           g.setColor(Color.magenta);
       if(flagC==7)
           g.setColor(Color.red);
       if(flagC==8)
           g.setColor(Color.pink );
       if(flagC==9)
           g.setColor(Color.gray );


        if(flag==1)
            for(index=index;index<pointcount;index++)
                g.fillOval(points[index].x,points[index].y, 4 , 4);

        if(flag==0){
            g.drawRect(x, y, width,height);
        }
        if(flag==3){
            g.drawOval(x,y,width,height);
        }
        if(flag==4){
            g.fillRect(x,y, width, height);
        }
       if(flag==5){
           g.drawLine(x, y, W, H);
           
       }
       if(flag==2){
          
           g.fillOval(x, y, width, height);
       }
       if(flag==6){
           g.setColor( new  Color(230,232,232) );

           for(index=index;index<pointcount;index++)
               g.fillRect(points[index].x,points[index].y, 5, 5);

       }
       if(flag==7){


            for(index=index;index<pointcount;index++)
               g.fillRect(points[index].x,points[index].y, 7, 7);
       }
       if(flag==8){
            g.setColor( new  Color(230,232,232) );
            g.fillRect(0,0, 950, 700);


       }

    }
}



