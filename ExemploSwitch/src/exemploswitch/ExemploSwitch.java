package exemploswitch;
//Yasmin

import javax.swing.JOptionPane;

public class ExemploSwitch {
    public static void main(String[] args) {
        String res=JOptionPane.showInputDialog("Día en número");
        int dia=Integer.parseInt(res);
        switch(dia){
            case 1:JOptionPane.showMessageDialog(null,"Luns");
                break;
            case 2:JOptionPane.showMessageDialog(null,"Martes");
                break;
            case 3:JOptionPane.showMessageDialog(null,"Mercores");
                break;
            case 4:JOptionPane.showMessageDialog(null,"Xoves");
                break;
            case 5:JOptionPane.showMessageDialog(null,"Venres");
                break;
            case 6:JOptionPane.showMessageDialog(null,"Sábado");
                break;
            case 7:JOptionPane.showMessageDialog(null,"Domingo");
                break;
            default:JOptionPane.showMessageDialog(null,"Teclea unha opción entre o 1 e o 7");
        }
        JOptionPane.showMessageDialog(null,"Sair do programa");
    }
    
}
