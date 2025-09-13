package scr;

class Ave extends Animal {
    public Ave(String nome, String raca) {
        super(nome, raca);
    }

    public void comer() {
        System.out.println(nome + " está comendo;");
    }
    public void andar() {
        System.out.println(nome + " está andando;");
    }
    public void voar() {
        System.out.println(nome + " está voando no céu;");
    }
    public void pousar() {
        System.out.println(nome + " está poussando.");
    }
    public static void main(String[] args) {
        Ave minhaAve = new Ave(" Pirla ", " Papagaio ");
        System.out.println(" Nome da ave: " + minhaAve.nome + ", Raça: " + minhaAve.raca);
        minhaAve.comer();
        minhaAve.andar();
        minhaAve.voar();
        minhaAve.pousar();
    }
}
