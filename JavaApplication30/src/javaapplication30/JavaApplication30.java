/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
String harfNotu = null;

int vizeExam,finalExam,projeNotu;
double ort;
        System.out.println("Vize notunuzu giriniz: ");
vizeExam = scanner.nextInt();
        System.out.println("Proje notunuzu giriniz: ");
        projeNotu =scanner.nextInt();
        System.out.println("Final notunuzu giriniz: ");
       finalExam = scanner.nextInt();
        
        ort = (vizeExam*0.3 )+ (projeNotu*0.2) + (finalExam*0.5 );
         if(ort>100 && ort<0){
             System.out.println("Geçersiz not girişi yaptınız");
         }
        else if(ort>=90){
            harfNotu = "AA";
        }
        else if(ort>=85){
            harfNotu ="BA";
        }
        else if(ort>=80)
            harfNotu = "BB";
        
        else if(ort>=75){
            harfNotu = "CB";
            
        }
        else if(ort>=70){
            harfNotu ="CC";
        }
        else if(ort>=65){
            harfNotu ="DC";
        }
        else if(ort>=60){
            harfNotu ="DD";
        }
        else if(ort>=55){
            harfNotu ="FD";
        }
        else 
            harfNotu ="FF";
         
         
        System.out.println("Harf  Notunuz: " + harfNotu);
        
        

        
        }
    
}
