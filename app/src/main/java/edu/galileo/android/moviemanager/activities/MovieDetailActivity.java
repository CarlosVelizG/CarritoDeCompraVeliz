package edu.galileo.android.moviemanager.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.galileo.android.moviemanager.R;
import edu.galileo.android.moviemanager.models.Producto;
//import edu.galileo.android.moviemanager.models.Producto;

public class MovieDetailActivity extends AppCompatActivity {

    static Producto producto;
    @BindView(R.id.ivMovieBackdrop)
    ImageView ivMovieBackdrop;
    @BindView(R.id.tvOverview)
    TextView tvOverview;
    @BindView(R.id.imagenJuego)
    ImageView imagenJuego;

    static List<Producto> listaCarrito = new ArrayList<Producto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               listaCarrito.add(producto);
                Snackbar.make(view, "Juego agrgado al carrito de compras", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
               /* if(listaCarrito.isEmpty()){
                    listaCarrito.add(producto);
                    Snackbar.make(view, "Juego agrgado al carrito de compras", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else{
                    for(Producto miCarrito: MovieDetailActivity.getListaCarrito()){
                        if(miCarrito.getTitle().equalsIgnoreCase(producto.getTitle())){
                            listaCarrito.remove(producto);
                            Snackbar.make(view, "Juego retirado del carrito de compras", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                        }else{
                            listaCarrito.add(producto);
                            Snackbar.make(view, "Juego agrgado al carrito de compras", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();

                        }

                    }
                }*/


            }


        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            producto = (Producto) extras.getSerializable("MOVIE");
            this.setTitle(producto.getTitle());
            tvOverview.setText(producto.getShortdesc());

          /*  if(producto.getImage()!=null) {
                Picasso.with(this)
                        .load(producto.getImage())
                        .into(imagenJuego);
            }else{
                Picasso.with(this)
                        .load(R.drawable.notfound)
                        .into(imagenJuego);
            }
*/
            Picasso.with(this)
                    .load(producto.getUrl_imagen_poster())
                    .into(ivMovieBackdrop);
            if (producto.getUrl_image().isEmpty()) { //url.isEmpty()
                Picasso.with(this)
                        .load(R.drawable.notfound)
                        .placeholder(R.drawable.notfound)
                        .error(R.drawable.notfound)
                        .into(imagenJuego);

            }else{
                Picasso.with(this)
                        .load(producto.getUrl_image())
                        .error(R.drawable.tenor)
                        .placeholder(R.drawable.tenor)
                        .into(imagenJuego); //this is your ImageView
            }

        }
    }

    //Obtenemos la lista Carrito
    public static List<Producto> getListaCarrito() {
        return listaCarrito;
    }
}
