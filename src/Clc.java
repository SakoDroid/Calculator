import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sako
 * This is the main handler for the calculator. Do not modify without knowledge.
 */
//The four main operators hander:

public class Clc {
    //Variables declaration
    public static ArrayList<Double> N = new ArrayList();
    public static ArrayList<Integer> F = new ArrayList();
    public static ArrayList<Double> MPlus = new ArrayList();
    public static ArrayList<Double> MMinus = new ArrayList();
    //End of variables declaration
    
    public static double Hdl (){
        double rslt = 0;
        if(N.size() == 2){
            rslt = First();
        }else if (N.size()<2){}
        else {
            for (int i = 1; i < F.size() & i < N.size()-1; i++) {
                if(i == 1){
                    rslt = First();
                }
                try {
                    switch (F.get(i)){
                        case 1 :
                            rslt+= N.get(i+1);
                            break;
                        case 2  :
                            rslt -= N.get(i+1);
                            break;
                        case 3 :
                            rslt *= N.get(i+1);
                            break;
                        case 4 :
                            rslt /= N.get(i+1);
                            break;
                    }
                }catch (ArithmeticException ex){
                    JOptionPane.showMessageDialog(null, "Mathematic Error!", "oops!", JOptionPane.ERROR);
                }
        }
            
        }
        return rslt;
    }
    private static double First(){
        double t = 0;
            try {
                switch (F.get(0)){
                    case 1 :
                        t += N.get(0) + N.get(1);
                        break;
                    case 2  :
                        t +=N.get(0) - N.get(1);
                        break;
                    case 3 :
                        t +=N.get(0)*N.get(1);
                        break;
                    case 4 :
                        t +=N.get(0)/N.get(1);
                        break;
                }
            }catch (ArithmeticException ex){
                JOptionPane.showMessageDialog(null, "Mathematic Error!", "oops!", JOptionPane.ERROR);
            }
            return t;
    }
    //Memory handler:
    public static double memoryResault(){
        double sum = 0;
        double min = 0;
        for (double a : MPlus) {
            sum += a;
        }
        for (double a : MMinus){
            min += a;
        }
        return sum - min;
    }
}
