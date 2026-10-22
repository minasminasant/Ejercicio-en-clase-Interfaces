public class Librodigital extends Contenido implements Descargable{
    private int paginas;

    public Librodigital(String titulo, String autor, int paginas){
        super(titulo, autor);
        this.paginas = paginas;
    }

    public String tipo(){
        return "Libro";
    }

    public double calculartamanoMB(){
        return paginas * 0.2;
    }
}