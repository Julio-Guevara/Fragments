package julio.salazar.guevara.botones;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {
    WebView wvWeb;


    public WebFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View webView = inflater.inflate(R.layout.fragment_web, container, false);
        wvWeb = webView.findViewById(R.id.wvWeb);
        wvWeb.loadUrl("https://www.reddit.com/r/Freegamestuff/");
        wvWeb.setWebViewClient(new WebViewClient());

        return webView;
    }

}
