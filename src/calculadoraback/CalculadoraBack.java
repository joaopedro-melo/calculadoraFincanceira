
package calculadoraback;

import java.util.Scanner;


public class CalculadoraBack {

    public static double capitalInvestido;
    public static double preçodaAção = 0;
    public static double numerodeAções = 0;
    public static double patrimonioLiquido = 0;
    public static double lucroLiquido = 0;
    public static String conta;
    public static String ação;
    
    
    public static void roeMetodo(){
        double fimRoe = lucroLiquido/patrimonioLiquido;
        System.out.println("O Roe de "+ ação +" é de "+fimRoe);
    }
    
    public static void roicMetodo(){
        double roic = lucroLiquido / capitalInvestido;
          System.out.println("O total de Roic de "+ação+" foi de "+roic);
        
    }
    
    public static void valorMetodo(){
      double valordeMercado = preçodaAção * numerodeAções;
         System.out.println("O valor de mercado de "+ação+" é de "+valordeMercado);     
    }
     
    public static void main(String[] args) {
     CalculadoraBack indicador = new CalculadoraBack(); 
     Scanner tec = new Scanner(System.in);
     
     
     System.out.println("Olá qual indicador ira utilizar?");  
     System.out.println("1 - Roe");
     System.out.println("2 - Roic");        
     System.out.println("3 - Valor de Mercado");        
             
     conta = tec.nextLine();
     
     switch(conta){
          case "1":
         System.out.println("Digite o código da ação");
         ação = tec.nextLine();
         System.out.println("Digite o Lucro Líquido de "+ação);
         lucroLiquido = tec.nextDouble();
         System.out.println("Digite o Patrimônio Líquido de "+ação);
         patrimonioLiquido = tec.nextDouble();
         indicador.roeMetodo();
         break;
          case "2":
          System.out.println("Digite o código da ação");
         ação = tec.nextLine();
          System.out.println("Digite o lucro líquido de "+ação);
          lucroLiquido = tec.nextDouble();
          System.out.println("Digite o capital investido de "+ação);
          capitalInvestido = tec.nextDouble();
          indicador.roicMetodo();
          break;
          case "3":
         System.out.println("Digite o código da ação");
         ação = tec.nextLine();
         System.out.println("Digite o número total de ações de "+ ação);
         numerodeAções = tec.nextDouble();
         System.out.println("Digite o valor atual da ação "+ ação);
         preçodaAção = tec.nextDouble();
         indicador.valorMetodo();
           break;
          default:
         System.out.println("Desculpe não encontrei seu indicador");
      }
        
    }
}
    

   
    

