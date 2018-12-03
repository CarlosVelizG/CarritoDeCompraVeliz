package edu.galileo.android.moviemanager.fragments;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.galileo.android.moviemanager.R;
import edu.galileo.android.moviemanager.adapters.MovieRecyclerViewAdapter;
import edu.galileo.android.moviemanager.models.Producto;

/**
 * A simple {@link Fragment} subclass.
 */
public class NowPlayingFragment extends Fragment /*implements SearchView.OnQueryTextListener*/ {


    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
   /* @BindView(R.id.search)
    SearchView searchView;*/





    private MovieRecyclerViewAdapter adapter;
   // private List<Movie> movies;
    public static ArrayList<Producto> imageMovieArrayList= new ArrayList<Producto>();
    public static ArrayList<Producto> imageMovieArrayList2= new ArrayList<Producto>();

        public void CargarLista(){
            imageMovieArrayList2.removeAll(imageMovieArrayList2);
            for(Producto lista:NowPlayingFragment.getImageMovieArrayList()){
                if(lista.getOferta().contains("N")) {
                    imageMovieArrayList2.add(lista);
                }
        }
        }

    public NowPlayingFragment() {
        // Required empty public constructor
    }

    public static ArrayList<Producto> getImageMovieArrayList() {
        return imageMovieArrayList;
    }

   // @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_now_playing, container, false);
        ButterKnife.bind(this, view);

        initializeData();
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);


        adapter = new MovieRecyclerViewAdapter(getContext(), imageMovieArrayList2);
        rvMovies.setAdapter(adapter);


        return view;
    }

    private void initializeData() {

        imageMovieArrayList = new ArrayList<>();


        imageMovieArrayList.add(
                new Producto(
                        1,
                        "FIFA 19 PS4 PlayStation 4",
                        "Marca: E-Sport",
                        4.3,
                        59.00,
                        "https://i.linio.com/p/f3ef3415dcd7445fe3b2c8fcb2f39cc1-catalog.webp",
                        "https://www.nintenderos.com/wp-content/uploads/2018/06/FIFA-19-min.jpg",
                        "S",
                        30,
                        ""));
        imageMovieArrayList.add(
                new Producto(
                        1,
                        "Marvel Spider-Man PlayStation4 ps4",
                        "Marca: Sony",
                        4,
                        59.99,
                        "https://i.linio.com/p/e2c827aedab24572112e1b72874e7ab3-catalog.webp",
                        "https://i.ytimg.com/vi/n0H_Q_JsboU/maxresdefault.jpg",
                        "N",
                        0,
                        ""));

        imageMovieArrayList.add(
                new Producto(
                        1,
                        "Far Cry 4 PS4 PlayStation 4",
                        "Marca: Ubisoft",
                        3.9,
                        69.00,
                        "https://i.linio.com/p/e66318f0273167c430ce3fc1fecb8f54-catalog.webp",
                        "https://hardzone.es/app/uploads/2014/11/Far-Cry-4-portada.jpg",
                        "S",
                        25,
                        ""
                ));
        imageMovieArrayList.add(
                new Producto(
                        1,
                        "PES 2019 PlayStation 4 Edicion David Beckham",
                        "Marca: Konami",
                        3.9,
                        69.00,
                        "https://i.linio.com/p/41225997d4ec9a363ce30e4b46ab3c3d-catalog.webp",
                        "https://www.sonyers.com/wp-content/uploads/2018/08/PES2019_Art.jpg",
                        "N",
                        0,
                        ""
                ));
        imageMovieArrayList.add(
                new Producto(
                        1,
                        "Call Of Duty Ghosth Playstation 3",
                        "Marca: AcTivion",
                        2.9,
                        21.00,
                        "",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS42qqMh2plbyzkfObktB_BBK9wFXdPfhHqDptOIr5-8ERUxroq",
                        "S",
                        50,
                        ""
                ));
        imageMovieArrayList.add(
                new Producto(
                        1,
                        "Watch Dogs 2 Ps4 Playstation 4",
                        "Marca: Sony",
                        1.9,
                        49.00,
                        "https://i.linio.com/p/7402854cf3302406f5a9bb4afdbd47b8-catalog.webp",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT999Sa647hLupzWJVWzcZG2u84HOhimqbfknoJSS4Gx_qC5U1K",
                        "N",
                        0,
                        ""
                ));
        imageMovieArrayList.add(
                new Producto(
                        1,
                        "Sonic Forces PS4 Bonus Edition Ps4 Playstation 4",
                        "Marca: Sega",
                        3.3,
                        90.00,
                        "https://i.linio.com/p/4f0ee69f7b4ae6fd8bf90d805c8a16a3-catalog.webp",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSguYO-W4eFhix0XZP-RwBdxSq6ea6S75D2AEfQqsfDLexuCxQA",
                        "S",
                        33,
                        ""
                ));
        imageMovieArrayList.add(
                new Producto(
                        1,
                        "Resident Evil Revelations 2 PS4",
                        "Marca: Capcom",
                        2.7,
                        33.00,
                        "https://i.linio.com/p/c52de0d804b88e16522d2dcff835730e-catalog.webp",
                        "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/main_element/public/media/image/2015/02/449738-analisis-resident-evil-revelations-2-episodio-1.png?itok=YJSPgO3y",
                        "S",
                        12,
                        ""
                ));
      imageMovieArrayList.add(
                new Producto(
                        1,
                        "Assassin's Creed Origins para PlayStation 4 PS4",
                        "Marca: Ubisoft",
                        5.0,
                        69.00,
                        "https://i.linio.com/p/ecd03a0c1dc62f6eab4dedaca6a374eb-catalog.webp",
                        "https://media.redadn.es/imagenes/assassins-creed-origins-pc-ps4-xbox-one_316166.jpg",
                        "S",
                        30,
                        ""
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Prey PS4 PlayStation 4",
                        "Marca: Bethesda",
                        3.9,
                        49.00,
                        "https://i.linio.com/p/6b0ac8c34418402588f64c92fa0e2719-catalog.webp",
                        "https://img.youtube.com/vi/9B_OHHMnkVE/hqdefault.jpg",
                        "S",
                        20,
                        ""
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Transformers Rise Of The Dark Spark PS3 para Playstation 3",
                        "Marca: AcTivision",
                        2.4,
                        44.80,
                        "https://i.linio.com/p/d0b844363c46331374b9b564147e56c9-catalog.webp",
                        "https://i.vimeocdn.com/video/480766039_1280x720.jpg",
                        "N",
                        0,
                        ""
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Lego Marvel Super Heroes PsVita",
                        "Marca:WBGames ",
                        3.7,
                        32.10,
                        "https://i.linio.com/p/407850277eac2010895169f40db218d1-catalog.webp",
                        "http://i.ytimg.com/vi/8gH-d_qsKEA/maxresdefault.jpg",
                        "N",
                        0,
                        ""
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Killzone 3 En 3d, PS3 Juegos Playstation 3",
                        "Marca: Sony",
                        4.2,
                        29.99,
                        "https://i.linio.com/p/81f5fccfaa64d2176a80af2a69392bfd-catalog.webp",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbAZlB1vtQhR_SjsN5fLKIm_-8pmZ_esK4rhYikaYYO5tkedbX",
                        "N",
                        0,
                        ""
                )); /*  imageMovieArrayList.add(
                new Producto(
                        1,
                        "Dmc Devil May Cry Definitive Edition, Ps4",
                        "Marca: Capcom",
                        1.7,
                        39.59,
                        "https://i.linio.com/p/0207528a5f85aed819ad5ec2ca6cff01-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "The Evil Within Ps4",
                        "Marca: Bethsda",
                        3.5,
                        63.60,
                        "https://i.linio.com/p/62129cf17371ff5f403f6f6e2b19ad29-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "The Order 1886 Ps4",
                        "Marca: Sony",
                        2.9,
                        32.10,
                        "https://i.linio.com/p/dda3c1d0fc9472759ab017b03a38530a-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Infamous Second Son Ps4",
                        "Marca: Sony",
                        4.0,
                        67.19,
                        "https://i.linio.com/p/f951c585a55247954451b5947f19a1de-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Injustice Gods Among Us Ultimate Edition PS3 Juego Físico",
                        "Marca: WBGames",
                        1.5,
                        39.52,
                        "https://i.linio.com/p/35d349f92a6786cc2f0efa26697957d1-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "All-stars Battle Royale, PsVita",
                        "Marca: Sony",
                        2.6,
                        37.00,
                        "https://i.linio.com/p/a93abdbed0e900cc7e1c55c4e02cbf32-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Lego The Hobbit PsVita",
                        "Marca: WBGames",
                        4.2,
                        32.10,
                        "https://i.linio.com/p/4a38b756d342f0af94acff53b6220ff5-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Need For Speed Rivals Playstation 4",
                        "Marca: EASports",
                        3.3,
                        45.00,
                        "https://i.linio.com/p/d3f6f6cde3eabb2999120553f606be0c-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Rayman Legends Playstation 4",
                        "Marca: Ubisoft",
                        2.9,
                        38.00,
                        "https://i.linio.com/p/8883c821106d01478be7c8baa8825048-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Tom Clancy's The Division Ps4 PlayStation 4",
                        "Marca: Ubisoft",
                        3.3,
                        54.99,
                        "https://i.linio.com/p/80606c1cf1f5aaf0af259797268261c0-catalog.webp"
                ));    imageMovieArrayList.add(
                new Producto(
                        1,
                        "Batman return to arkham Ps4 PlayStation 4",
                        "Marca: WBGames",
                        3.9,
                        37.00,
                        "https://i.linio.com/p/b205c69b8bb2295899e8f3dcef529943-catalog.webp"
                ));
        imageMovieArrayList.add(new Producto(
                1,
                "Caballeros del Zodiaco: Saint Seiya: Soldiers' Soul Ps4 PlayStation 4",
                "Marca: Bandai Nanco",
                4.9,
                38.00,
                "https://i.linio.com/p/df8b4747e6d1469ff31a6edd731ded62-catalog.webp"
        ));*/
        CargarLista();


}


        /*movies.add(new Movie("121856", "Passengers", "A spacecraft traveling to a distant colony planet and transporting thousands of people has a malfunction in its sleep chambers. As a result, two passengers are awakened 90 years early.", 6.2f, 745, "/5gJkVIVU7FDp7AfRAbPSvvdbre2.jpg", "/5EW4TR3fWEqpKsWysNcBMtz9Sgp.jpg"));
        movies.add(new Movie("330459", "Assassin's Creed", "Lynch discovers he is a descendant of the secret Assassins society through unlocked genetic memories that allow him to relive the adventures of his ancestor, Aguilar, in 15th Century Spain. After gaining incredible knowledge and skills he’s poised to take on the oppressive Knights Templar in the present day.", 5.3f, 691, "/tIKFBxBZhSXpIITiiB5Ws8VGXjt.jpg", "/5EW4TR3fWEqpKsWysNcBMtz9Sgp.jpg"));
        movies.add(new Movie("283366", "Rogue One: A Star Wars Story", "A rogue band of resistance fighters unite for a mission to steal the Death Star plans and bring a new hope to the galaxy.", 7.2f, 1802, "/qjiskwlV1qQzRCjpV0cL9pEMF9a.jpg", "/tZjVVIYXACV4IIIhXeIM59ytqwS.jpg"));
        movies.add(new Movie("313369", "La La Land", "Mia, an aspiring actress, serves lattes to movie stars in between auditions and Sebastian, a jazz musician, scrapes by playing cocktail party gigs in dingy bars, but as success mounts they are faced with decisions that begin to fray the fragile fabric of their love affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart.", 8, 396, "/ylXCdC106IKiarftHkcacasaAcb.jpg", "/nadTlnTE6DdgmYsN4iWc2a2wiaI.jpg"));
*/


   /* @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }*/


}
