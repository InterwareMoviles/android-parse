package interware.parseandroid.Utils;

import android.app.Activity;

import interware.parseandroid.ui.Loader.Loader;

/**
 * Created by chelixpreciado on 7/14/16.
 */
public class LoaderUtils {

    private Loader loader;
    private Activity activity;

    public LoaderUtils(Activity activity){
        this.activity = activity;
    }

    private boolean isShowing;

    private Loader getLoader() {
        if (loader==null)
            loader = Loader.newInstance();
        return loader;
    }

    public void showLoader(boolean shouldShow){
        if (shouldShow)
            getLoader().show(activity.getFragmentManager(), "ShowLoader");
        else
            if (isShowing)
                getLoader().dismiss();
        isShowing = shouldShow;
    }
}
