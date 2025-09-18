package exemplo_empresa_funcionario.view;

import exemplo_empresa_funcionario.model.Assalariado;
import exemplo_empresa_funcionario.model.Empresa;
import exemplo_empresa_funcionario.model.Funcionario;
import exemplo_empresa_funcionario.model.Horista;

public class App {

    public static void main(String[] args) {

        Assalariado joao = new Assalariado("111.111.111-01",
                "João", 2000);
        Assalariado maria = new Assalariado("222.222.222-02",
                "Maria", 2500);
        Horista pedro = new Horista("333.333.333-03", "Pedro",
                60, 40);

        Funcionario funcionarios[] = {joao, maria, pedro};
        Empresa empresa = new Empresa("123.123.123/0001-01",
                "IFPB", funcionarios);
        System.out.println(empresa.calcularPagamentos());

    }

}