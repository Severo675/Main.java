package scr;

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
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro(" Bilu", " Golden Retriever ");
        Ave minhaAve = new Ave(" Pirla ", " Papagaio ");

        System.out.println(" Nome do cachorro: " + meuCachorro.nome + ", Raça: " + meuCachorro.raca );
        meuCachorro.comer();
        meuCachorro.andar();

        System.out.println();

        System.out.println(" Nome da ave: " + minhaAve.nome + ", Raça: " + minhaAve.raca);
        minhaAve.comer();
        minhaAve.andar();
    }
}
