package ex.pkg4.pkg2.pkg0;
import java.util.Scanner;

public class Ex420 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int man = 0;
        int fem = 0;
        int contador = 0;
        int menor = 0;
        int maior = 0;
        int somaI = 0;
        int somaA = 0;
        
        while(true){
            
            System.out.print("Cadastre o nome da pessoa:");
            String nome = scn.nextLine();

            System.out.print("Digite o gênero: (M) ou ()");
            String gen = scn.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scn.nextInt();

            System.out.print("Digite a altura: ");
            float altura = scn.nextFloat();

            System.out.print("Digite o peso: ");
            int peso = scn.nextInt();
            
            if("sair".equals(nome)){
                break;
            }
            
            contador++;
            somaI += idade;
            somaA += altura;
            
            if("F".equals(gen)){
                fem++;
            }else if ("M".equals(gen)){
                man++;
            }
            
        int mediaI = idade / contador;
        
        float mediaA = altura / contador;
        
        System.out.println("média das idades: " + mediaI);
        System.out.println("média das idades: " + mediaA);
        
        scn.close();
        
        }  
    }   
}
