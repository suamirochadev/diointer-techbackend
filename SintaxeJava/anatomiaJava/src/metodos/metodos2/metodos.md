Nomenclatura de métodos

somar(int n1, int n2) {}

abrirConexao() {}

concluirProcessamento() {}

findById(int id) {}

calcularImprimir() {}

///
public class MyClass {
public double somar(int num1, int num2) {
// LOGICA - FINALIDADE DO MÉTODO
return....;
}

    	public void imprimir(String texto) {
    						//Logica - finalidade do método
    						//aqui não precisa de return
    						//pois não será retornado nenhum resultado


}
//throws Exception: indica que o método ao
//ser utilizado poderá gerar uma exceção

    	public double dividir(int dividendo, int divisor) throws Exception {}

//este método não pode ser visto por outras classes no
private void metodoPrivado() {}

//alguns equivocos estruturais
public void validar() {}
//esse metodo deveria retornar algum valor
//no caso boolean (true ou false)
}

public void calcularEnviar(){}
//um método deve representar uma única respossabilidade

public void gravarCliente(String nome, String cpf, Integer)
// este método tem a finalidade de gravar
// informações de um cliente, por que não criar
// um objeto cliente e passar como parâmetro?
//veja abaixo

public void gravarCliente(Cliente cliente) {}
//ou
public void gravar(Cliente cliente) {}
