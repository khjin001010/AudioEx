package khjin001010.kr.hs.emirim.audiotext;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch switchMusic;
    MediaPlayer musicPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchMusic = (Switch)findViewById(R.id.switch_music);
        musicPlayer = MediaPlayer.create(this, R.raw.chch);
        switchMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchMusic.isChecked())
                    musicPlayer.start();
                else
                    musicPlayer.pause(); //일시 정지
            }
        });
    }

    @Override
    protected void onStop() { //activity가 중지되었다 == 화면에서 사라졌다
        super.onStop();
        musicPlayer.stop();
    }
}
