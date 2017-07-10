package omnia.videoplayer;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Lenovo-pc on 07/07/2017.
 */

public class VideoPlayerFrag extends Fragment {
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.video_player_frag,container,false);
        VideoView videoView=(VideoView) v.findViewById(R.id.videoView);
        Uri uri=Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.iti);
        videoView.setVideoURI(uri);
        videoView.start();

        return v;
    }
}
