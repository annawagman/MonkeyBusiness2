import android.app.Activity;
import android.os.Bundle;

import android.view.Window;
import android.view.WindowManager;

import com.jaktinthebox.annwags.monkeybusiness2.GamePanel;

/**
 * Created by Annwags on 7/26/16.
 */
public class SecondPage extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature (Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);




        // SET THE CONTENT
        setContentView(new GamePanel(this));




    }
}
