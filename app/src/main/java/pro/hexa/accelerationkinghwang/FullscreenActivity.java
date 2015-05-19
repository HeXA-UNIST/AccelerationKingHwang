package pro.hexa.accelerationkinghwang;

import pro.hexa.accelerationkinghwang.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends AppCompatActivity {

    private static MediaPlayer mp;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);
        mp = MediaPlayer.create(this, R.raw.janggun);
        mp.setLooping(true);
        mp.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.game_main);
                TextView textView = (TextView) findViewById(R.id.text);
                Animation translatebu= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animationfile);
                textView.setText("때는 바야흐로\n" +
                                " 2015년\n" +
                                " 인류는 이기와 욕심을 이겨내지 못하고\n" +
                                " 쾌락에 탐닉하다 종말에 빠져든다.\n" +
                                " UNIST 컴퓨터 동아리로 위장하고 있던\n" +
                                " 세계평화기구 HeXA는 이러한 지구를 구하기 위해\n" +
                                " 연구를 거듭했지만 번번히 실패\n " +
                                " 그리고 실패...\n \n " +
                                " 인류는 이대로 멸망하나 싶었지만\n " +
                                " 헥사 마스터 김유창이 우연히\n " +
                                " HeXA의 유일신 곽신의 노트를 발견한다.\n " +
                                " 곽신은 종말을 예견한 것일까.\n " +
                                " 그곳에는 이렇게 적혀 있었다\n " +
                                " 지구 어딘가 신의 지피유가 숨겨져 있으며\n " +
                                " 이 지피유들을 전부 가속시키 곽신의 코드를 돌리면\n " +
                                " 인류는 새로운 가상세계 속에서 살아갈 수 있게된다.\n " +
                                " 그러나 도저히 그 신의 지피유들을\n " +
                                " 구하러 갈 힘이 인류에겐 남아있지 않았다 \n\n\n " +
                                " 그러던 어느날 부원 호암 황원준이 \n " +
                                " 실수로 백해무익의 극약인 술을 마시게 되고 \n " +
                                " 고통스러워 하던 호암은 갑자기 \n \"지피유 가속 슈웅~\" \n " +
                                " 을 외치며 가속왕으로 변신하게 된다! \n" +
                                " 이제 이 이야기는 가속왕이 신의 gpu를 구해 지구를 구한\n 2015년 \n 어느 무더웠던 여름의 \n 이야기 이다.\n"
                );
                textView.startAnimation(translatebu);

            }
        }, 3000);


    }
}
