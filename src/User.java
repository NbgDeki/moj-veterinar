class User {
    private int id;
    private String ime_ljubimca, ime_vlasnika, pol, tegobe, rasa;
    public User(int id, String ime_ljubimca, String ime_vlasnika, String pol, String tegobe, String rasa){
        
        this.id = id;
        this.ime_ljubimca = ime_ljubimca;
        this.ime_vlasnika = ime_vlasnika;
        this.pol = pol;
        this.tegobe = tegobe;
        this.rasa = rasa;
    }
    
    public int getId(){
        return id;
    }
    public String getImeLjubimca(){
        return ime_ljubimca;
    }
    public String getImeVlasnika(){
        return ime_vlasnika;
    }
    public String getPol(){
        return pol;
    }
    public String getTegobe(){
        return tegobe;
    }
    public String getRasa(){
        return rasa;
    }
}
