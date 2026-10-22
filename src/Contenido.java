public abstract class Contenido implements Comparable<Contenido> {
    private String titulo;
    private String autor;

    public Contenido(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public abstract String tipo();

    @Override
    public String toString(){
        return tipo() + ":" + titulo + "|" + autor;
    }
    
    @Override
    public int compareTo(Contenido otro) {
        return this.titulo
            .compareToIgnoreCase(otro.titulo);
    }
}