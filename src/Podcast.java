public class Podcast extends Contenido implements Reproducible, Descargable{
    private int duracionseg;
    private int episodio;

    public Podcast(String titulo, String autor, int duracionseg, int episodio){
        super(titulo, autor);
        this.duracionseg = duracionseg;
        this.episodio = episodio;
    }

    public String tipo(){
        return "podcast";
    }

    public void reproducir(){
        int min = duracionseg / 60;
        int seg = duracionseg % 60;
        String segTexto = "" + seg;
        if(seg < 10){
            segTexto = "0" + seg;
        }
        System.out.println("Reproducir podcast: " + getTitulo() + "episodio: " + episodio + "| " + min + ":" + segTexto);
    }

    public int getDuracionseg(){
        return duracionseg;
    }

    public double calculartamanoMB(){
        double minutos = duracionseg / 60.0;
        return minutos * 1.0;
    }
}