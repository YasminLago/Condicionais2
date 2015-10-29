
package condicionais2;

import javax.swing.JOptionPane;

public class Compara {
    public static int pedirNumEnteiro(){
      int num;
      /*String res=JOptionPane.showInputDialog("Teclea número");
      num=Integer.parseInt(res);
      return num;*/
      return(Integer.parseInt(JOptionPane.showInputDialog("Teclea número")));
  }
  
   public static void comparar(int num1,int num2){
        if (num1>num2){
            JOptionPane.showMessageDialog(null,"O maior é "+num1);
        }
        
        else if (num1<num2){
            JOptionPane.showMessageDialog(null,"O maior é "+num2);    
        }
        
        else /*if(num1==num2)*/{
            JOptionPane.showMessageDialog(null,"Son iguais");
        }
   }


}
