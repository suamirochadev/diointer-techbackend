package dio.aulas.backend.anatomiadasclasses4;

import javax.lang.model.util.ElementScanner14;

public class boletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
