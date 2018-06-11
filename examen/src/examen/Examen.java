/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.Scanner;
/**
 *
 * @author Wendy Soto
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Libro[]libros= new Libro[10];
        Libro libro;
        Autor[]autores=new Autor[10];
        Autor autor;
        
        int opc=0;
        boolean favorito;
        int contfavorito=0;
        int contLibros=0;
       int contador=0;
        
      Autor[]contautores=new Autor[10];
      
        do{
            System.out.println("     MENU BIBLIOTECA");
            System.out.println(" 1.- Ingresar nuevo libro ");
            System.out.println(" 2.- visualizar lista de libros  favoritos");
            System.out.println(" 3.- Contar libros del autor");
            System.out.println(" 4.- Salir");
            System.out.println(" Ingrese una opcion");
            opc=scan.nextInt();
           switch(opc){
               
               case 1:
                if(contador==10){
                 System.out.println("La biblioteca esta llena");   
                }
                else {
                   System.out.println("Ingrese titulo del libro");
              scan.nextLine();
               String titulo=scan.nextLine();
               
               System.out.println("Ingrese el autor del libro");
               String autorNombre=scan.nextLine();
               System.out.println("Ingrese el pais del autor");
               String pais=scan.nextLine();
               System.out.println("Ingrese año de publicacion ");
               int anio=scan.nextInt();
               System.out.println("   ¿Es uno de tus libros favoritos????");
               System.out.println("digita 1 para SI y 0 para NO");
               int fav=scan.nextInt();
               if (fav==1){
                   favorito=true;
               }else{
                   favorito=false;
               }
               if(favorito==true){
                   contfavorito++;
               }
               contador++;
               System.out.println("contador: "+contador);
               scan.nextLine();
               autor=new Autor(autorNombre,pais);
               libro=new Libro(titulo,autor,anio,favorito);
               libros[contLibros]=libro;
               autores[contLibros]=autor;
                contLibros++;
                contautores[contLibros]=autor;
                
                }
               
                
               break;
               case 2:
                  System.out.println("    LIBROS FAVORITOS:");
                    for(int i=0; i<contLibros; i++ ){
                        if(libros[i].isFavorito()==true){
                         System.out.println("LIBRO "+(i+1)+libros[i]);
                            }
                        }  
                
               break;
               case 3:
                    int numautor=0;
                    int c=0;
                    System.out.println("AUTORES: ");
                    for(int i=0; i<contLibros; i++){
                        System.out.println("Autor "+(i+1)+":"+autores[i]);
                    }
                    System.out.println("Seleccione el numero de autor del que decea saber el numero de libros");
                    for(int j=0; j<contLibros; j++){
                        System.out.println("Autor: "+(j+1));
                    }
                    numautor=scan.nextInt();
                    
                        for(int j=0; j<contLibros; j++){
                            if(contautores[numautor].equals(autores[j])){
                                c++;
                            }                              
                        }
                    
                    System.out.println("El autor "+(numautor)+" tiene: "+(c)+" libros registrados");
               break;
               case 4:
               System.out.println("Adios");
               break;
               default:
               System.out.println("Opcion incorrecta digite nuevamente");
               
               
           } 
            
            
        }while(opc!=4);
    }
    
}
