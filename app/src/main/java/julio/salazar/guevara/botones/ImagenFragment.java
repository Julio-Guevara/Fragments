package julio.salazar.guevara.botones;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImagenFragment extends Fragment {
    ImageView ivImagen;


    public ImagenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miVista = inflater.inflate(R.layout.fragment_imagen, container, false);
        ivImagen = miVista.findViewById(R.id.ivImagen);
        Picasso.get().load("http://www.eluniversal.com.mx/sites/default/files/styles/f03-651x400/public/2015/06/10/noche_estrellada_entender_arte_st.jpg?itok=QRon3j37").into(ivImagen);

        return miVista;
    }

}
