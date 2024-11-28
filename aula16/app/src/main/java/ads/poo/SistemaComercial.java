package ads.poo;

import java.util.HashMap;

public class SistemaComercial {
    private HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();

    public boolean adicionarCliente(Cliente c) {

        if (this.clientes.get(c.getCpf()) == null) {
            this.clientes.put(c.getCpf(), c);
            return true;
        }

        return false;

    }

    public Cliente buscarCliente(String cpf) {
        return this.clientes.get(cpf);

    }

    public static void main(String[] args) {
        SistemaComercial hahahaha = new SistemaComercial();
        Cliente jeferson = new Cliente("123", "jeferson", "48373734142");
        Cliente leo = new Cliente("CPFrealMeu", "leo", "48998324877");
        Cliente hahahahah = new Cliente("CPFrealSeu", "risada", "23");

        hahahaha.adicionarCliente(jeferson);
        hahahaha.adicionarCliente(leo);
        hahahaha.adicionarCliente(hahahahah);

        System.out.println(hahahaha.buscarCliente("CPFrealMeu"));

    }
}
