package completojava;
// Classe base completojava

class Animal {
    String nome;
    String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void comer() {
        System.out.println(nome + " está comendo;");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

class Ave extends Animal {
    public Ave(String nome, String raca) {
        super(nome, raca);
    }

    public void voar() {
        System.out.println(nome + " está voando no céu;");
    }

    public void pousar() {
        System.out.println(nome + " está poussando;");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println(nome + " está latindo;");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando. ");
    }
} 

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro(" Bilu", " Golden Retriever ");
        Ave minhaAve = new Ave(" Pirla ", " Papagaio ");

        System.out.println(" Nome do cachorro: " + meuCachorro.nome + ", Raça: " + meuCachorro.raca );
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();

        System.out.println();

        System.out.println(" Nome da ave: " + minhaAve.nome + ", Raça: " + minhaAve.raca);
        minhaAve.comer();
        minhaAve.voar();
        minhaAve.pousar();
        minhaAve.andar();
    }
}
