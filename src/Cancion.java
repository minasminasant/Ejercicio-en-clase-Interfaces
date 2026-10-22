public class Cancion extends Contenido implements Reproducible, Descargable{
    private int duracionseg;

    public Cancion(String titulo, String autor, int duracionseg){
        super(titulo, autor);
        this.duracionseg = duracionseg;
    }

    public String tipo(){
        return "cancion";
    }

    public void reproducir(){
        int min = duracionseg / 60;
        int seg = duracionseg % 60;
        String segTexto = " " + seg;
        if(seg < 10){
            segTexto = "0" + seg;
        }
       System.out.println("Reproducir cancion: " + getTitulo() + " " + min + ": " + segTexto);
    }

    public int getDuracionseg(){
        return duracionseg;
    }

    public double calculartamanoMB(){
        double minutos = duracionseg / 60.0;
        return minutos * 1.5;
    }
}