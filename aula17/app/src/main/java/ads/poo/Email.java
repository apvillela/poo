package ads.poo;

public class Email {

    private String valorEmail;
    private String rotulo;
    
    public Email(String valorEmail, String rotulo) {
        this.valorEmail = valorEmail;
        this.rotulo = rotulo;
    }
    //TODO Arrumar validação email
    public boolean emailValido(){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w+]+)*(\\.[a-z]{2,})$";
        String email = "meu.email@dominio.com.br";

    }
    
    // System.out.println("Email válido? " + email.matches(eR));



    
}
