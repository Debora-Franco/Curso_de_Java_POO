package UltraEmojiCombat;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos Públicos
    public void apresentar(){
        System.out.println("--------------------------------------------");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR " + this.getNome());
        System.out.println("DIRETAMENTE DE " + this.getNacionalidade());
        System.out.println("COM " + this.getIdade());
        System.out.println("PESANDO "+ this.getPeso()+"KG");
        System.out.println(this.getVitorias()+" VITÓRIAS");
        System.out.println(this.getDerrotas()+" DERROTAS E");
        System.out.println(this.getEmpates()+" EMPATES!");
        
        
    }
    public void status(){
        System.out.println("--------------------------------------------");
        System.out.println(this.getNome()+ " É UM PESO "+ this.getCategoria());
        System.out.println("GANHOU " +this.getVitorias()+ "VEZES" );
        System.out.println("PERDEU " +this.getDerrotas()+" VEZES");
        System.out.println("EMPATOU " +this.getEmpates()+" VEZES");
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() +1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    } 
    
    
    //Métodos Especias

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura=al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
         if(this.peso<52.2){
            this.categoria= "INVÁLIDO";
        }else if(this.peso<=70.3){
            this.categoria="LEVE";
        }else if(this.peso<=83.9){
            this.categoria="MÉDIO";
        }else if(this.peso<=120.2){
            this.categoria="PESADO";
        }else{
            this.categoria="INVÁLIDO";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    

    

  
    
    
    
}
