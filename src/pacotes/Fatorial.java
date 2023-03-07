package pacotes;

public class Fatorial {
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor(int num){   // Calcula o fatorial
        numero = num;
        int fat = 1;
        String str = "";
        
        for (int cont = num; cont > 1; cont--){
            fat *= cont;
            str += cont + " X ";
        }
        str += "1 = ";
        fatorial = fat;
        formula = str;
    }
    
    public int getFatorial(){
        return fatorial;
    }
    
    public String getFormula(){
        return formula;
    }
}
