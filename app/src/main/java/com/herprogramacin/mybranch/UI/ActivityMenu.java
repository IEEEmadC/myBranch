package com.herprogramacin.mybranch.UI;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.herprogramacin.mybranch.R;

import java.net.HttpURLConnection;
import java.net.URL;

public class ActivityMenu extends AppCompatActivity {

    private Button btnNoticias;
    private Button btnInteractuar;

    private ImageView imageViewuno;
    private ImageView imageViewdos;
    private ImageView imageViewtres;
    private ImageView imageViewcuatro;

    private Bitmap loadedImageuno;
    private Bitmap loadedImagedos;
    private Bitmap loadedImagetres;
    private Bitmap loadedImagecuatro;

    private final String imageHttpAddressuno = "http://usofeed.netai.net/imguno.jpg";
    private final String imageHttpAddressdos = "http://usofeed.netai.net/imgdos.jpg";
    private final String imageHttpAddresstres = "http://usofeed.netai.net/imgtres.jpg";
    private final String imageHttpAddresscuatro = "http://usofeed.netai.net/imgcuatro.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_menu);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btnNoticias = (Button) findViewById(R.id.btnNoticias);

        btnNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ActivityList.class);
                startActivity(intent);
            }
        });


        btnInteractuar = (Button) findViewById(R.id.btnInteractuar);

        btnInteractuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, Realidad.class);
                startActivity(intent);
            }
        });

        imageViewuno = (ImageView) findViewById(R.id.imageViewuno);
        DescargarImagenUno(imageHttpAddressuno);

        imageViewuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ZoomActivity.class);
                startActivity(intent);
            }
        });

        imageViewdos = (ImageView) findViewById(R.id.imageViewdos);
        DescargarImagenDos(imageHttpAddressdos);

        imageViewdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ZoomActivity.class);
                startActivity(intent);
            }
        });

        imageViewtres = (ImageView) findViewById(R.id.imageViewtres);
        DescargarImagenTres(imageHttpAddresstres);

        imageViewtres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ZoomActivity.class);
                startActivity(intent);
            }
        });

        imageViewcuatro = (ImageView) findViewById(R.id.imageViewcuatro);
        DescargarImagenCuatro(imageHttpAddresscuatro);

        imageViewcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenu.this, ZoomActivity.class);
                startActivity(intent);
            }
        });


    }


    private static final Handler handler = new Handler();

    private void DescargarImagenUno(final String imageHttpAddress) {
        Thread networkThread = new Thread() {
            @Override
            public void run() {
                try {
                    URL imageUrl = null;
                    imageUrl = new URL(imageHttpAddress);
                    HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                    conn.connect();
                    loadedImageuno = BitmapFactory.decodeStream(conn.getInputStream());
                    runOnUiThread(new Runnable() {
                        public void run() {
                            imageViewuno.setImageBitmap(loadedImageuno);
                        }
                    });
                } catch (Exception e) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Error ", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        };
        networkThread.start();

    }

    private void DescargarImagenDos(final String imageHttpAddress) {
        Thread networkThread = new Thread() {
            @Override
            public void run() {
                try {
                    URL imageUrl = null;
                    imageUrl = new URL(imageHttpAddress);
                    HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                    conn.connect();
                    loadedImagedos = BitmapFactory.decodeStream(conn.getInputStream());
                    runOnUiThread(new Runnable() {
                        public void run() {
                            imageViewdos.setImageBitmap(loadedImagedos);
                        }
                    });
                } catch (Exception e) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Error ", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        };
        networkThread.start();

    }

    private void DescargarImagenTres(final String imageHttpAddress) {
        Thread networkThread = new Thread() {
            @Override
            public void run() {
                try {
                    URL imageUrl = null;
                    imageUrl = new URL(imageHttpAddress);
                    HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                    conn.connect();
                    loadedImagetres = BitmapFactory.decodeStream(conn.getInputStream());
                    runOnUiThread(new Runnable() {
                        public void run() {
                            imageViewtres.setImageBitmap(loadedImagetres);
                        }
                    });
                } catch (Exception e) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Error ", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        };
        networkThread.start();

    }

    private void DescargarImagenCuatro(final String imageHttpAddress) {
        Thread networkThread = new Thread() {
            @Override
            public void run() {
                try {
                    URL imageUrl = null;
                    imageUrl = new URL(imageHttpAddress);
                    HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                    conn.connect();
                    loadedImagecuatro = BitmapFactory.decodeStream(conn.getInputStream());
                    runOnUiThread(new Runnable() {
                        public void run() {
                            imageViewcuatro.setImageBitmap(loadedImagecuatro);
                        }
                    });
                } catch (Exception e) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Error ", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        };
        networkThread.start();

    }

    ///////////////


    ///////////////
}
