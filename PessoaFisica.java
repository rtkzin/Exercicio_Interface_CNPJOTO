class PessoaFisica extends Pessoa implements Mamifero {
    public PessoaFisica(String nome) {
        super(nome);
    }

    @Override
    public int getQuantidadeDeOlhos() {
        return quantidadeDeOlhos;
    }

    // Adicione este método, pois ele é requerido pela interface Mamifero
    public int getQuantidadeDePernas() {
        // Defina a quantidade de pernas para uma pessoa física
        return 2;
    }
}