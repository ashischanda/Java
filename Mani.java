
package ashispaint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPopupMenu;



public class Main {

    public static void main(String[] args) {

        mainpart Vari=new mainpart();
        Vari.show();
    }

}

 class mainpart extends JFrame implements ActionListener
 {

   // static void show(Component component, int x, int y) {
   //     throw new UnsupportedOperationException("Not yet implemented");
   // }


     private JPanel level=new JPanel();
     private JPanel level2= new JPanel();
     private static String[] names={"Rectangle","Pencil","Fillcircle","Circle","Fillrect","Line","Eraser","Brush","New"};
     private static String[] color={"black","blue","green","orange","yellow","cyan","megenta","red","pink","gray"};
     private JButton[] buttoncol=new JButton[color.length];
     private JButton[] buttons=new JButton[names.length];

     private JMenu file;
     private int C;         //flag for color

     private draw D=new draw();    // object of draw class
     
     private JPopupMenu popupMenu; 

     public mainpart()
     {

        setSize(800,600);
        setTitle("\"CSE DU Paint\"");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // end of constructor

       // popupMenu = new JPopupMenu();
        
         for(int i=0;i< names.length;i++){
            buttons[i]=new JButton(names[i]);
        //    popupMenu.add( buttons[ i ] );
            level.add(buttons[i]);
            }

        level.setLayout(new FlowLayout( ));


     
        file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu view=new JMenu ("View");
        JMenu tool=new JMenu ("Tools");
        JMenu win=new JMenu ("Window");
        JMenu he=new JMenu ("Help");
        
        file.setMnemonic('F');              // kaj kore na
        edit.setMnemonic('E');
        view.setMnemonic('V');
        tool.setMnemonic('T');
        win.setMnemonic('W');
        he.setMnemonic('H');   
        
       // ********* Start of file
        JMenuItem n=new JMenuItem("New");
        JMenuItem o=new JMenuItem("Open");
        JMenuItem s=new JMenuItem("Save");
        JMenuItem ext=new JMenuItem("Exit");
        file.add(n);
        file.addSeparator();
        file.add(o);
        file.addSeparator();
        file.add(s);
        file.addSeparator();
        
        n.setMnemonic('N');
        o.setMnemonic('O');
        s.setMnemonic('S');
        ext.setMnemonic('E');
        ext.addActionListener( new Exit());
        file.add(ext);
        
        
        
        
        JMenuItem help=new JMenuItem("Help");
        JMenuItem about=new JMenuItem("About");
        about.addActionListener( new Abo());
        help.addActionListener( new Help());
        
        he.add(about);
        he.addSeparator();
        he.add(help);
        
        
        //JMenuItem about=new JMenuItem("About...");

       // file.add(about);
       

        JMenuBar bar=new JMenuBar();
        setJMenuBar(bar);
        bar.add(file);
        bar.add(edit);
        bar.add(view);
        bar.add(tool);
        bar.add(win);
        bar.add(he);
    //************************  end of file

        // start of color

        JLabel name=new JLabel("Colors : ");
        level2.add(name);
        for(int i=0;i< color.length;i++){
            buttoncol[i]=new JButton();
            level2.add(buttoncol[i]);
            }
       
        level2.setLayout(new FlowLayout( ));


        buttoncol[0].setBackground(Color.black);
        buttoncol[1].setBackground(Color.blue);
        buttoncol[2].setBackground(Color.green);
        buttoncol[3].setBackground(Color.orange);
        buttoncol[4].setBackground(Color.yellow);
        buttoncol[5].setBackground(Color.cyan);
        buttoncol[6].setBackground(Color.magenta);
        buttoncol[7].setBackground(Color.red);
        buttoncol[8].setBackground(Color.pink);
        buttoncol[9].setBackground(Color.gray);

        level.setBorder(BorderFactory.createEtchedBorder());
        level2.setBorder(BorderFactory.createEtchedBorder());
        add(D,"Center");
        add(level,"South");
        add(level2, "North");


        for(int i=0;i< color.length;i++)
            buttoncol[i].addActionListener(this);

        for(int i=0;i< names.length;i++)
            buttons[i].addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        Object source=e.getSource();

        for(int i=0;i< names.length;i++)
            if(source==buttons[i])
            {
                D.flag=i;
                D.drawpicture();
                break;
            }

        for(int i=0;i< color.length;i++)
            if(source==buttoncol[i])
                D.flagC=i;
    }

}
