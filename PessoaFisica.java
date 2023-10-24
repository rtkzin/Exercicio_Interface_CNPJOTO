class PessoaFisica extends Pessoa implements Mamifero {
    public PessoaFisica(String nome) {
        super(nome);
    }

    @Override
    public int getQuantidadeDeOlhos() {
        return quantidadeDeOlhos;
    }

    public int getQuantidadeDePernas() {
        return 2;
    }
}
