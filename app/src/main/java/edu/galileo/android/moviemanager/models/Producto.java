package edu.galileo.android.moviemanager.models;


import java.io.Serializable;

public class Producto implements Serializable{

  /*  String id;
    String title;
    String overview;
    float voteAverage;
    float voteCount;
    String posterPath;
    String backdropPath;


    public Movie(String id, String title, String overview, float voteAverage, float voteCount, String posterPath, String backdropPath) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public float getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(float voteCount) {
        this.voteCount = voteCount;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342%s", posterPath);
        //return String.format("https://images.cointelegraph.com", backdropPath);

    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w780%s", backdropPath);


    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }*/

     /* public Producto(int id, String title, String shortdesc, double rating, double price, String url_image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.price = price;
        this.url_image = url_image;
    }*/

  /* public Producto(int id, String title, String shortdesc, double rating, double price, String url_image, String url_imagen_poster) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.price = price;
        this.url_image = url_image;
        this.url_imagen_poster = url_imagen_poster;
    }
*/

    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private double price;
    private String url_image;
    private String url_imagen_poster;
    private String oferta;
    private int descuento;
    private String precioDescuento;



    public Producto(int id, String title, String shortdesc, double rating, double price, String url_image, String url_imagen_poster, String oferta, int descuento, String precioDescuento) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.price = price;
        this.url_image = url_image;
        this.url_imagen_poster = url_imagen_poster;
        this.oferta = oferta;
        this.descuento = descuento;
        this.precioDescuento = precioDescuento;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public String getUrl_image() {
        return url_image;
    }

    public String getUrl_imagen_poster() {
        return url_imagen_poster;
    }

    public String getOferta() {
        return oferta;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDescuento() {
        return descuento;
    }

    public String getPrecioDescuento() {
        return precioDescuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setPrecioDescuento(String precioDescuento) {
        this.precioDescuento = precioDescuento;
    }
}
