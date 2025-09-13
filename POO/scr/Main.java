package scr;

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro(" Bilu ", " Golden Retriever ");
        Ave minhaAve = new Ave("Pirla ", " Papagaio");

        System.out.println("Nome do cachorro: " + meuCachorro.nome + ",  Raça: " + meuCachorro.raca);
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.andar();

        System.out.println();

        System.out.println("Nome da ave: " + minhaAve.nome + ", Raça: " + minhaAve.raca);
        minhaAve.comer();
        minhaAve.andar();
        minhaAve.voar();
        minhaAve.pousar();
    }
}

