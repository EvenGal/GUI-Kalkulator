import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//Enkel kalkulator GUI

public class Kalkulator {

    private JFrame frame = new JFrame("Calculator");
    private JTextArea txtScreen = new JTextArea();

    //Kalkulasjoner

    String strnum1 = "";
    String strnum2 = "";
    String[] statement;
    int num1 = 0;
    int num2 = 0;
    String strtotal = "";
    int totalVal = 0;

    

    // Nummere
    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");

    // Operasjoner

    private JButton btnDivide = new JButton("/");
    private JButton btnMulti = new JButton("*");
    private JButton btnAdd = new JButton("+");
    private JButton btnSub = new JButton("-");
    private JButton btnEqual = new JButton("=");
    //Const
    public Kalkulator() {
        //Setter en frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 550);
        frame.setResizable(false);
        frame.setLayout(null);
        //Txtscreen i framen
        txtScreen.setSize(380, 100);
        txtScreen.setLocation(7, 5);
        txtScreen.setEditable(false);

        
        //"Animasjoner"

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("0");

            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("1");

            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("2");

            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("3");

            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("4");

            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("5");

            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("6");

            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("7");

            }
        });


        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("8");

            }
        });


        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("9");

            }
        });


        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("/");

            }
        });


        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("*");

            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("+");

            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("-");

            }
        });

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(txtScreen.getText().contains("+")){
                    statement = txtScreen.getText().split("\\+");
                    strnum1 = statement[0];
                    strnum2 = statement[1];
                    num1 = Integer.parseInt(strnum1);
                    num2 = Integer.parseInt(strnum2);

                    totalVal = num1 + num2;

                    strtotal = Integer.toString(totalVal);

                    txtScreen.setText(strtotal);
                
                }else if(txtScreen.getText().contains("-")){
                    statement = txtScreen.getText().split("\\-");
                    strnum1 = statement[0];
                    strnum2 = statement[1];
                    num1 = Integer.parseInt(strnum1);
                    num2 = Integer.parseInt(strnum2);

                    totalVal = num1 - num2;

                    strtotal = Integer.toString(totalVal);

                    txtScreen.setText(strtotal);
                
                }else if(txtScreen.getText().contains("*")){
                    statement = txtScreen.getText().split("\\*");
                    strnum1 = statement[0];
                    strnum2 = statement[1];
                    num1 = Integer.parseInt(strnum1);
                    num2 = Integer.parseInt(strnum2);

                    totalVal = num1 * num2;

                    strtotal = Integer.toString(totalVal);

                    txtScreen.setText(strtotal);

                }else if(txtScreen.getText().contains("/")){
                    statement = txtScreen.getText().split("\\/");
                    strnum1 = statement[0];
                    strnum2 = statement[1];
                    num1 = Integer.parseInt(strnum1);
                    num2 = Integer.parseInt(strnum2);

                    totalVal = num1 / num2;

                    strtotal = Integer.toString(totalVal);

                    txtScreen.setText(strtotal);
            }
        }

        });

        

        //Her setter jeg size og location paa knappene
        btn0.setSize(100, 50);
        btn0.setLocation(250, 450);

        btn1.setSize(100, 50);
        btn1.setLocation(250, 400);

        btn2.setSize(100, 50);
        btn2.setLocation(250, 350);

        btn3.setSize(100, 50);
        btn3.setLocation(250, 300);

        btn4.setSize(100, 50);
        btn4.setLocation(250, 250);

        btn5.setSize(100, 50);
        btn5.setLocation(150, 450);

        btn6.setSize(100, 50);
        btn6.setLocation(150, 400);

        btn7.setSize(100, 50);
        btn7.setLocation(150, 350);

        btn8.setSize(100, 50);
        btn8.setLocation(150, 300);

        btn9.setSize(100, 50);
        btn9.setLocation(150, 250);

        btnAdd.setSize(100, 50);
        btnAdd.setLocation(50, 450);

        btnSub.setSize(100, 50);
        btnSub.setLocation(50, 400);

        btnMulti.setSize(100, 50);
        btnMulti.setLocation(50, 350);

        btnDivide.setSize(100, 50);
        btnDivide.setLocation(50, 300);


        btnEqual.setSize(100, 50);
        btnEqual.setLocation(50, 250);
        
        //Adder alt til framen
        frame.add(txtScreen);
        frame.add(btn0);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        
        //Operasjoner
        frame.add(btnDivide);
        frame.add(btnMulti);
        frame.add(btnAdd);
        frame.add(btnSub);
        frame.add(btnEqual);
    
    }

    public static void main(String[] args) {
        //Nytt kalkulator objekt
        new Kalkulator();
    }


}
