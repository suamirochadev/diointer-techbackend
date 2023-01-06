package dio.aulas.backend.anatomiadasclasses3;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Suami";
        String segundoNome = "Rocha";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // na minha classe, vou ter um método

    public static String nomeCompleto(String primeiroNome, String segundoNome);

    {
        return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
