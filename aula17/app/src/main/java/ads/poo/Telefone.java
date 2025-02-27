package ads.poo;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Telefone {
    private String valorTelefone;
    private String rotulo;

    public Telefone(String valor, String rotulo) {
        this.valorTelefone = valor;
        this.rotulo = rotulo;
    }

    public boolean setValorTelefone(String valorTelefone) {
        this.valorTelefone = formata("(##) #####-####", valorTelefone);
        return this.valorTelefone != null;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    private String formata(String mascara, String valor) {
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            return null;
        }
        return resultado;
    }
    // Telefone telefone = new Telefone("+5548998320876", "trabalho");

}
