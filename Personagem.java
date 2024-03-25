package packagejhon;

public class Personagem {
    public int vida = 10;
    public Float speed = 100f;
    public String nome = "Jonathan";
    public Boolean vivo = false;
    public Boolean trabalhou;

    void FezTrabalho(){
        if (!vivo){
            trabalhou = false;
        }
        else trabalhou = true;
    }
}