import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;



public class Kalkulator{

    private JFrame frame = new JFrame("Calculator");
    private JTextArea txtScreen = new JTextArea();

    //Nummere
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
    
    //Operasjoner

    private JButton btnDivide = new JButton("/");
    private JButton btnMulti = new JButton("*");
    private JButton btnAdd = new JButton("+");
    private JButton btnSub = new JButton("-");


    public Kalkulator(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 550);
        frame.setResizable(false);
        frame.setLayout(null);
        
        txtScreen.setSize(380, 100);
        txtScreen.setLocation(7, 5);
        txtScreen.setEditable(false);

        btn0.setSize(100, 50);
        btn0.setLocation(250, 390);
        
        btn1.setSize(100, 50);
        btn1.setLocation();

        
        //Tall
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

    
    }

    public static void main(String[] args) {

        new Kalkulator();
    }


}
