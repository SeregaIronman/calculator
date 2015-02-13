import java.awt.event.*;
        import javax.swing.*;
        import java.awt.*;
        import javax.swing.JFrame;

public class untitled10 {

    int x;
    JFrame frame;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b10;
    JButton b11;
    JButton b12;
    JButton b13;
    JButton b14;
    JButton b15;


    JTextField t;
    int firstValue = 0;
    String operation = "+";

    public static void main (String [] args) {
        untitled10 gui= new untitled10();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("0");
        b2 = new JButton("1");
        b3 = new JButton("2");
        b4 = new JButton("3");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("7");
        b9 = new JButton("8");
        b10 = new JButton("9");
        b11 = new JButton("+");
        b12 = new JButton("-");
        b13 = new JButton("*");
        b14 = new JButton("/");
        b15 = new JButton("=");
        t=new JTextField(12);

        b1.addActionListener(new BListener());
        b2.addActionListener(new BListener());
        b3.addActionListener(new BListener());
        b4.addActionListener(new BListener());
        b5.addActionListener(new BListener());
        b6.addActionListener(new BListener());
        b7.addActionListener(new BListener());
        b8.addActionListener(new BListener());
        b9.addActionListener(new BListener());
        b10.addActionListener(new BListener());
        b11.addActionListener(new BListener());
        b12.addActionListener(new BListener());
        b13.addActionListener(new BListener());
        b14.addActionListener(new BListener());
        b15.addActionListener(new BListener());


        frame.setSize(200,500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(t);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(b15);

    }

    class BListener implements ActionListener {


        public void actionPerformed (ActionEvent e)  {
            if (e.getSource()==b1) {
                t.setText(null);
                x=0;
                t.setText(""+x);
            }
            if (e.getSource()==b2) {
                t.setText(null);
                x=1;
                t.setText(""+x);
            }
            if (e.getSource()==b3) {
                t.setText(null);
                x=2;
                t.setText(""+x);
            }
            if (e.getSource()==b4) {
                t.setText(null);
                x=3;
                t.setText(""+x);
            }

               if (e.getSource()==b5) {
                t.setText(null);
                x=4;
                t.setText(""+x);
            }
            if (e.getSource()==b6) {
                t.setText(null);
                x=5;
                t.setText(""+x);
            }
            if (e.getSource()==b7) {
                t.setText(null);
                x=6;
                t.setText(""+x);
            }
            if (e.getSource()==b8) {
                t.setText(null);
                x=7;
                t.setText(""+x);
            }

              if (e.getSource()==b9) {
                t.setText(null);
                x=8;
                t.setText(""+x);
            }
            if (e.getSource()==b10) {
                t.setText(null);
                x=9;
                t.setText(""+x);
            }


            if (e.getSource()==b11) {
                firstValue = x;
                operation = "+";
            }
            if (e.getSource()==b12) {
                firstValue = x;
                operation = "-";
            }

          if (e.getSource()==b13) {
                firstValue = x;
                operation = "*";
            }
            if (e.getSource()==b14) {
                firstValue = x;
                operation = "/";
            }


if (e.getSource()==b15) {
int secondValue = Integer.valueOf(t.getText());
                if("+".equals(operation)){
                    t.setText(""+(firstValue+secondValue));
                }
                if("-".equals(operation)){
                    t.setText(""+(firstValue-secondValue));
                }
                if("*".equals(operation)){
                    t.setText(""+(firstValue*secondValue));
                }
                if("/".equals(operation)){
                    t.setText(""+(firstValue/secondValue));
                }
               }

        }
    }
}