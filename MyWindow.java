/**
 *  Java 1. Lesson8
 *
 *  @author Igor Shirokov
 *
 *  @version 08.12.2021
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

/*
//
//======== GridLayout ========
//
public class MyWindow extends JFrame {
   public MyWindow() {
       setBounds(500, 500, 400, 300);
       setTitle("GridLayoutDemo");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setLayout(new GridLayout(3, 3));
       for (int i = 0; i < 9; i++) {
           add(new JButton(String.valueOf(i + 1)));
       }
       setVisible(true);
   }

   public static void main(String[] args) {
       new MyWindow();
   }
}
*/

/*
//
//======== Disable item Composer ========
//
public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(500,500,300,300);
        setTitle("Manual GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 32);
        add(field);
        JButton button = new JButton("Нажми сюда");
        button.setBounds(20, 60, 120, 32);
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
*/

//
//======== Handling button clicks ========
//
/*
public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Нажми сюда!");
        add(button, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button.setText("Нажал!");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
*/

//
//======== Handling the Enter button in a text box ========
//
/*
public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(textField.getText());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
*/
//
//======== Simple Counter Application ========
//
class CounterApp extends JFrame {
    private int value;

    public CounterApp(int initialValue) {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}
