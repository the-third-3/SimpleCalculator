package simplecalc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator {
public static void main(String[] args) {

   JFrame new4 = new JFrame("CALCULATOR.");

 

  

    JLabel f1= new JLabel("FST NO:");

    JLabel f2= new JLabel("SEC NO:");

    JLabel res= new JLabel("RES NO:");

    final JTextField m3 = new JTextField(20);

    final JTextField m4 = new JTextField(20);

    final JTextField result = new JTextField(10);

    

    new4.add(f1);

    new4.add(f2);

    new4.add(res);

    new4.add(m3);

    new4.add(m4);

    new4.add(result);

    

    f1.setBounds(125,10,50,30); m3.setBounds(200,10,130,25);

      f2.setBounds(125,40,50,30); m4.setBounds(200,40,130,25);

       res.setBounds(125,70,50,30); result.setBounds(200,75,130,25);

       

       JButton ad=new JButton("ADD");

       JButton sub=new JButton("SUB");

       JButton mul=new JButton("MUL");

       JButton div=new JButton("DIV");

       JButton remainder=new JButton("MOD");

       JButton clear=new JButton("DEL");

        JButton sq=new JButton("SQR");

       JButton SQRT=new JButton("SQRT");

       JButton tan=new JButton("TAN");

       JButton cos=new JButton("COS");

       JButton sin=new JButton("SIN");

       JButton cube=new JButton("CUB");

       JButton cuberoot=new JButton("CBRT");

        JButton log=new JButton("LOG");

       JButton exp=new JButton("EXP");

       

        JButton inv=new JButton("X^-1");

       

              

           

    ad.setBounds(60,150,70,25);

    sub.setBounds(60,190,70,25); 

      mul.setBounds(145,150,70,25);

    div.setBounds(145,190,70,25); 

    remainder.setBounds(60,230,70,25);

      clear.setBounds(145,230,70,25);

      

               

    sq.setBounds(230,150,70,25);

    SQRT.setBounds(230,190,70,25); 

      tan.setBounds(60,270,70,25);

   sin.setBounds(145,270,70,25); 

    cos.setBounds(230,270,70,25);

      log.setBounds(315,150,70,25);

      inv.setBounds(315,190,70,25);

      

       cube.setBounds(230,230,70,25);

      cuberoot.setBounds(315,230,70,25);

      

      

      ad.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

          double n2=Double.parseDouble(m4.getText());

         result.setText(String.valueOf(n1+n2));

         

      } 

      });

      sub.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

          double n2=Double.parseDouble(m4.getText());

         result.setText(String.valueOf(n1-n2));

         

      }

      });

      mul.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

          double n2=Double.parseDouble(m4.getText());

         result.setText(String.valueOf(n1*n2));

         

      }

      });

       div.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

          double n2=Double.parseDouble(m4.getText());

         result.setText(String.valueOf(n1/n2));

         

      }

      });

        remainder.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

        int n1=Integer.parseInt(m3.getText());

        int n2=Integer.parseInt(m4.getText());

          int rest=n1/n2;

         result.setText(String.valueOf(n1-(rest*n2)));

         

      }

      });

        clear.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

          

         double n1=Double.parseDouble(m3.getText());

         

          double n2=Double.parseDouble(m4.getText());

          m3.setText("");

            m4.setText("");

         result.setText(String.valueOf(""));

         

      }

      });

        

         sq.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

          double n2=Double.parseDouble(m4.getText());

         result.setText(String.valueOf(n1*n1));

         

      }

      });

          SQRT.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

         result.setText(String.valueOf(Math.sqrt(n1)));

         

      }

      });

          

           tan.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

         result.setText(String.valueOf(Math.tan(Math.toRadians(n1)) ));

         

      }

      });

           

            cos.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

         result.setText(String.valueOf(Math.cos(Math.toRadians(n1)) ));

         

      }

      });

             sin.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

         result.setText(String.valueOf(Math.sin(Math.toRadians(n1)) ));

         

      }

      }); 

             cube.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

          

         result.setText(String.valueOf(n1*n1*n1));

         

      }

      });

             

       cuberoot.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

         

         result.setText(String.valueOf(Math.cbrt(n1)));

         

      }

      }); 

       log.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

         result.setText(String.valueOf(Math.log10(n1)));

         

      }

      });

       

     

        

         inv.addActionListener(new ActionListener()

      {

      public void actionPerformed(ActionEvent e)

      {

         double n1=Double.parseDouble(m3.getText());

       

         result.setText(String.valueOf(1/n1));

         

      }

      });

              

   new4.add(ad); ad.setBackground(Color.red);

   new4.add(sub); sub.setBackground(Color.red);

   new4.add(mul); mul.setBackground(Color.RED);

   new4.add(div); div.setBackground(Color.red);

   new4.add(remainder); remainder.setBackground(Color.red);

   new4.add(clear); clear.setBackground(Color.green);

   new4.add(sq); sq.setBackground(Color.red);

   new4.add(SQRT); SQRT.setBackground(Color.red);

   new4.add(tan); tan.setBackground(Color.RED);

   new4.add(cos); cos.setBackground(Color.RED);

   new4.add(sin);  sin.setBackground(Color.red);

   new4.add(cube);  cube.setBackground(Color.red);

   new4.add(cuberoot); cuberoot.setBackground(Color.RED);

   new4.add(log); log.setBackground(Color.RED);

   new4.add(exp); exp.setBackground(Color.red);

   new4.add(inv);  inv.setBackground(Color.red);

   

   JLabel comment1=new JLabel("FOR SINE TAN COS SQR SQRT CUB CBRT LOG AND INV");

   new4.add(comment1);

   comment1.setBounds(65,360,400,40);

    JLabel comment2=new JLabel("ENTER THE VALUE TO BE COMPUTED IN THE FIRST NO FIELD");

   new4.add(comment2);

   comment2.setBounds(50,390,400,40);

   

   JTextArea details = new JTextArea(60,250);

    new4.add(details);

    details.setBounds(40,360,380,67);

    details.setBackground(Color.MAGENTA);

  

                  

   new4.getContentPane().setBackground(Color.red);

    new4.setLayout(null);

   new4.setSize(470,500);

   new4.setVisible(true);

   

          

}
}

