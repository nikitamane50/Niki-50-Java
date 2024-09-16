import java.awt.*;
import javax.swing.*;

public class GridLayoutExample{
JFrame frameObj;
  
GridLayoutExample(){
frameObj=new JFrame();
JButton btn1=new JButton("1");
frameObj.add(btn1);

frameObj.setLayout(new GridLayout());
frameObj.setSize(300,300);
frameObj.setVisible(true);
}
public static void main(String[] args){
new GridLayoutExample();
}
}