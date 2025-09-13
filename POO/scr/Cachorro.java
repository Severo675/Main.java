package scr;

class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

     public void comendo() {
        System.out.println(nome + " está comendo;");
    }
    public void latir() {
        System.out.println(nome + " está latindo;");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro(" Bilu", " Golden Retriever ");

         System.out.println(" Nome do cachorro: " + meuCachorro.nome + ", Raça: " + meuCachorro.raca );
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();
    }
} 

