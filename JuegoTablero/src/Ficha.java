public class Ficha {
    private String color = "";
    private Dado dado;

    public Ficha(String _color){
        color = _color;
        dado = new Dado(6);
    }
    public int avanzar(){
        int pasos = dado.lanzar();
        return pasos;
    }
    public String getColor(){
        return color;
    }
}

