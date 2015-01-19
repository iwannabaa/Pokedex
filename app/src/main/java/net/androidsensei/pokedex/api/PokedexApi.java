package net.androidsensei.pokedex.api;

import com.android.volley.Response;

import net.androidsensei.pokedex.PokedexApplication;
import net.androidsensei.pokedex.model.PokemonList;

/**
 * Created by carlos on 18/1/15.
 */
public class PokedexApi {

    public static String MY_POKEDEX_URL = "http://mi-pokedex.herokuapp.com/api/";
    public static String POKEMOS_URL = MY_POKEDEX_URL + "pokemons";

    public static void getPokemons(Response.Listener listener, Response.ErrorListener errorListener) {

        GsonRequest<PokemonList> request = new GsonRequest<PokemonList>(POKEMOS_URL, PokemonList.class, listener, errorListener);

        PokedexApplication.getInstance().addToRequestQueue(request);

    }
}
