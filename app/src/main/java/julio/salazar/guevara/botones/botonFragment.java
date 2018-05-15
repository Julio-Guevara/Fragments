package julio.salazar.guevara.botones;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class botonFragment extends Fragment {
    Button saludar;


    public botonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miVista = inflater.inflate(R.layout.fragment_boton, container, false);
        saludar = miVista.findViewById(R.id.btnSaludar);

        saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Hola mundo desde un Fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return miVista;
    }

}
