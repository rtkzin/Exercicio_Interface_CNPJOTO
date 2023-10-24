public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João");
        pessoaFisica.setIdade(30);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ");

        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Idade: " + pessoaFisica.getIdade());
        System.out.println("Quantidade de Olhos: " + pessoaFisica.getQuantidadeDeOlhos());
        System.out.println("Quantidade de Pernas: " + pessoaFisica.getQuantidadeDePernas());

        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Idade: " + pessoaJuridica.getIdade());
    }
}