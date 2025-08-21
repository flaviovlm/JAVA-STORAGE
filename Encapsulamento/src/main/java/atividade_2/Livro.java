package atividade_2;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroPag;
    private double valorPago;

    public Livro(String titulo, String autor, String isbn, int numeroPag, double valorPago) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPag = numeroPag;
        this.valorPago = valorPago;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Livro" +
                "\nTitulo = " + titulo + '\'' +
                "\nAutor = " + autor + '\'' +
                "\nISBN = " + isbn + '\'' +
                "\nNúmero de Páginas = " + numeroPag +
                "\nValor Pago = " + valorPago;
    }
}
