package com.example.indotravel;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TipsTricks extends AppCompatActivity {

    VideoView videoView, video2, vidio, vidio1, vidio2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_tricks);

        videoView = (VideoView)findViewById(R.id.videoView);

        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.vidio1;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        video2 = (VideoView)findViewById(R.id.video2);

        VideoView video2 = findViewById(R.id.video2);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.video2;
        Uri uri2 = Uri.parse(videoPath2);
        video2.setVideoURI(uri2);

        MediaController md2 = new MediaController(this);
        video2.setMediaController(md2);
        md2.setAnchorView(video2);

        vidio = (VideoView)findViewById(R.id.vidio);

        VideoView vidio = findViewById(R.id.vidio);
        String videoPath3  = "android.resource://" + getPackageName() +"/" + R.raw.vidio;
        Uri uri3 = Uri.parse(videoPath3);
        vidio.setVideoURI(uri3);

        MediaController md3 = new MediaController(this);
        vidio.setMediaController(md3);
        md3.setAnchorView(vidio);

        vidio1 = (VideoView)findViewById(R.id.vidio1);

        VideoView vidio1 = findViewById(R.id.vidio1);
        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.vidio1;
        Uri uri4 = Uri.parse(videoPath4);
        vidio1.setVideoURI(uri4);

        MediaController md4 = new MediaController(this);
        vidio1.setMediaController(md4);
        md4.setAnchorView(vidio1);

        vidio2 = (VideoView)findViewById(R.id.vidio2);

        VideoView vidio2 = findViewById(R.id.vidio2);
        String videoPath5 = "android.resource://" + getPackageName() + "/" + R.raw.vidio2;
        Uri uri5 = Uri.parse(videoPath5);
        vidio2.setVideoURI(uri5);

        MediaController md5 = new MediaController(this);
        vidio2.setMediaController(md5);
        md5.setAnchorView(vidio2);
    }
}
