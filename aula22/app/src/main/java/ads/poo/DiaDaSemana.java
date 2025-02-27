package ads.poo;

public enum DiaDaSemana {
    DOM("domingo",1),
    SEG("segunda",2),
    TER("terca",3),
    QUA("quarta",4),
    QUI("quinta",5),
    SEX("sexta",6),
    SAB("sabado",7);


    public final String extenso;
    public final int code;

    DiaDaSemana(String s,int c){
        this.extenso = s;
        this.code = c;
    }
    public static DiaDaSemana getByCode(int code){
        for(DiaDaSemana d : DiaDaSemana.values()){
            if(d.code == code){
                return d;
            }

        }return null;
    }

    @Override
    public String toString() {
        return "DiaDaSemana{" +
                "extenso='" + extenso + '\'' +
                "} " + super.toString();
    }
}
