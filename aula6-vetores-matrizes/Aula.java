public class Aula {
    // declarando array em depois prenchendo ele
    public static void passo1() {
        System.out.println("======= PASSO 1 =====");
        
        Pessoa a[] = new Pessoa[10];

        a[0] = new Pessoa("Epitacio");

        System.out.println("Nome é: " + a[0].nome);
    }

    // declarando array e já setando o seu conteudo
    public static void passo2(){
        System.out.println("======= PASSO 2 =====");

        Pessoa a[] = {
            new Pessoa("Epitacio"),
            new Pessoa("Matheus"),
        };

        System.out.println("Nome é: " + a[0].nome);
    }

    // declarar array e le-lô
    public static void passo3(){
        System.out.println("======= PASSO 3 =====");

        Pessoa a[] = {
            new Pessoa("Epitacio"),
            new Pessoa("Thalyta")
        };

        for (int i = 0; i < a.length; i++){
            System.out.println("Nome é: " + a[i].nome);
        }
    }

    public static void main(String[] args) {
        Aula.passo1();
        Aula.passo2();
        Aula.passo3();
    }
}

class Pessoa {
    String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
}