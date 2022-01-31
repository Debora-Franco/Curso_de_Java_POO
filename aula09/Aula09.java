
package aula09;


public class Aula09 {

   
    public static void main(String[] args) {
        
       Pessoa[] p= new Pessoa[2];
       Livro[] l= new Livro[3];
       
       p[0]=new Pessoa("Lisiane",35, "F");
       p[1]=new Pessoa("Joao",15, "M");
       
       l[0]= new Livro("O triunfo","Napoleon Hill", 500, p[0]);
       l[1]=new Livro("O poder do subconciente","Joseph Murf", 200, p[1]);
       l[2]= new Livro("Nano","Josef", 500, p[0]);
       
       
       l[0].abrir();
       l[0].folhear(600);
        System.out.println(l[0].detalhes());
       
    }
      
        
        
    
}
