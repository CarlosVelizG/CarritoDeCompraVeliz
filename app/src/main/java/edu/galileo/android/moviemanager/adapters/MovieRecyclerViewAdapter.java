package edu.galileo.android.moviemanager.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.galileo.android.moviemanager.R;
import edu.galileo.android.moviemanager.activities.MovieDetailActivity;
//import edu.galileo.android.moviemanager.fragments.NowPlayingFragment;
//import edu.galileo.android.moviemanager.models.Movie;
import edu.galileo.android.moviemanager.models.Producto;


public class MovieRecyclerViewAdapter extends RecyclerView.Adapter<MovieRecyclerViewAdapter.ViewHolder> {

    List<Producto> productos;
    Context context;
    //Array para el filtro
   /* public static ArrayList<Producto> imageModelArrayList= new ArrayList<Producto>();
    private ArrayList<Producto> arraylist;*/



    public MovieRecyclerViewAdapter(Context context, List<Producto> movies){
        this.productos = movies;
        this.context = context;

    }

    private Context getContext(){
        return context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Producto producto = productos.get(position);
        holder.txtTitulo.setText(producto.getTitle());
        holder.txtDescripcion.setText(producto.getShortdesc());
        if(producto.getOferta().contains("S")){
            holder.textOferta.setText("OFERTA");
            holder.textViewPrice_s2.setText("$");
            holder.txtPrecio.setText(String.valueOf(producto.getPrecioDescuento()));
            holder.textPrecioDescuento.setText(String.valueOf(producto.getPrice()));
            holder.textViewPrice_s2.setTextColor(Color.parseColor("#c0c0c0"));
            holder.textPrecioDescuento.setTextColor(Color.parseColor("#c0c0c0"));
            holder.txtPrecio.setTextColor(Color.parseColor("#ff0000"));
            holder.txtPrecio.setTextColor(Color.parseColor("#ff0000"));

        }else{
            holder.txtPrecio.setText(String.valueOf(producto.getPrice()));
        }

        if (producto.getUrl_image().isEmpty()) { //url.isEmpty()
            Picasso.with(context)
                    .load(R.drawable.notfound)
                    .placeholder(R.drawable.notfound)
                    .error(R.drawable.notfound)
                    .into(holder.imPortada);

        }else{
            Picasso.with(context)
                    .load(producto.getUrl_image())
                    .error(R.drawable.tenor)
                    .placeholder(R.drawable.tenor)
                    .into(holder.imPortada); //this is your ImageView
        }
       // Picasso.with(getContext()).load(movie.getImage()).into(holder.imPortada);

    }

    // Filter Class
   /* public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        NowPlayingFragment.movies.clear();
        if (charText.length() == 0) {
            NowPlayingFragment.movies.addAll(arraylist);
        } else {
            for (Movie wp : arraylist) {
                if (wp.getTitle().toLowerCase(Locale.getDefault()).contains(charText)||wp.getShortdesc().toLowerCase(Locale.getDefault()).contains(charText)) {
                    NowPlayingFragment.movies.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }*/

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.ivMovieImage)
        ImageView imPortada;
        @BindView(R.id.textViewTitle)
        TextView txtTitulo;
        @BindView(R.id.textViewShortDesc)
        TextView txtDescripcion;
        @BindView(R.id.textViewPrice)
        TextView txtPrecio;
        @BindView(R.id.cvMovie)
        CardView cvMovie;
        @BindView(R.id.textPrecioDescuento)
        TextView textPrecioDescuento;
        @BindView(R.id.textOferta)
        TextView textOferta;
        @BindView(R.id.textViewPrice_s2)
        TextView textViewPrice_s2;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Producto movie = productos.get(getAdapterPosition());

            Intent intent = new Intent(getContext(), MovieDetailActivity.class);
            intent.putExtra("MOVIE", movie);
            getContext().startActivity(intent);

        }
    }
}
