package com.herprogramacin.mybranch.UI;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

import com.herprogramacin.mybranch.R;

import java.net.HttpURLConnection;
import java.net.URL;

public class ZoomActivity extends FragmentActivity {

    private Animator mCurrentAnimator;

    private int mShortAnimationDuration;

    //ImageViews
    private  ImageView thumb1View;
    private  ImageView thumb2View;
    private  ImageView thumb3View;
    private  ImageView thumb4View;
    private  ImageView thumb5View;
    private  ImageView thumb6View;




    //Bitmaps de imagenes
    private Bitmap loadedImageuno;
    private Bitmap loadedImagedos;
    private Bitmap loadedImagetres;
    private Bitmap loadedImagecuatro;
    private Bitmap loadedImagecinco;
    private Bitmap loadedImageseis;


    //Imagenes
    private final String imageHttpAddressuno = "http://usofeed.netai.net/imguno.jpg";
    private final String imageHttpAddressdos = "http://usofeed.netai.net/imgdos.jpg";
    private final String imageHttpAddresstres = "http://usofeed.netai.net/imgtres.jpg";
    private final String imageHttpAddresscuatro = "http://usofeed.netai.net/imgcuatro.jpg";
    private final String imageHttpAddresscinco = "http://usofeed.netai.net/imgcinco.jpg";
    private final String imageHttpAddressseis = "http://usofeed.netai.net/imgseis.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);

        thumb1View = (ImageView)findViewById(R.id.thumb_button_1);
        DescargarImagenUno(imageHttpAddressuno);

        thumb1View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomImageFromThumb(thumb1View, loadedImageuno);
            }
        });

        thumb2View = (ImageView)findViewById(R.id.thumb_button_2);
        DescargarImagendos(imageHttpAddressdos);
        thumb2View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomImageFromThumb(thumb2View, loadedImagedos);
            }
        });

        thumb3View = (ImageView)findViewById(R.id.thumb_button_3);
        DescargarImagentres(imageHttpAddresstres);

        thumb3View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomImageFromThumb(thumb3View, loadedImagetres);
            }
        });

        thumb4View = (ImageView)findViewById(R.id.thumb_button_4);
        DescargarImagencuatro(imageHttpAddresscuatro);

        thumb4View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomImageFromThumb(thumb4View, loadedImagecuatro);
            }
        });

        thumb5View = (ImageView)findViewById(R.id.thumb_button_5);
        DescargarImagencinco(imageHttpAddresscinco);

        thumb5View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomImageFromThumb(thumb5View, loadedImagecinco);
            }
        });

        thumb6View = (ImageView)findViewById(R.id.thumb_button_6);
        DescargarImagenseis(imageHttpAddressseis);

        thumb6View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomImageFromThumb(thumb6View, loadedImageseis);
            }
        });





        // Retrieve and cache the system's default "short" animation time.
        mShortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);
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
                            thumb1View.setImageBitmap(loadedImageuno);
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

    private void DescargarImagendos(final String imageHttpAddress) {
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
                            thumb2View.setImageBitmap(loadedImagedos);
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

    private void DescargarImagentres(final String imageHttpAddress) {
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
                            thumb3View.setImageBitmap(loadedImagetres);
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

    private void DescargarImagencuatro(final String imageHttpAddress) {
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
                            thumb4View.setImageBitmap(loadedImagecuatro);
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

    private void DescargarImagencinco(final String imageHttpAddress) {
        Thread networkThread = new Thread() {
            @Override
            public void run() {
                try {
                    URL imageUrl = null;
                    imageUrl = new URL(imageHttpAddress);
                    HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                    conn.connect();
                    loadedImagecinco = BitmapFactory.decodeStream(conn.getInputStream());
                    runOnUiThread(new Runnable() {
                        public void run() {
                            thumb5View.setImageBitmap(loadedImagecinco);
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

    private void DescargarImagenseis(final String imageHttpAddress) {
        Thread networkThread = new Thread() {
            @Override
            public void run() {
                try {
                    URL imageUrl = null;
                    imageUrl = new URL(imageHttpAddress);
                    HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                    conn.connect();
                    loadedImageseis = BitmapFactory.decodeStream(conn.getInputStream());
                    runOnUiThread(new Runnable() {
                        public void run() {
                            thumb6View.setImageBitmap(loadedImageseis);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Navigate "up" the demo structure to the launchpad activity.
                // See http://developer.android.com/design/patterns/navigation.html for more.
                NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void zoomImageFromThumb(final View thumbView, Bitmap loadedImagen) {
        // If there's an animation in progress, cancel it immediately and proceed with this one.
        if (mCurrentAnimator != null) {
            mCurrentAnimator.cancel();
        }

        // Load the high-resolution "zoomed-in" image.
        final ImageView expandedImageView = (ImageView) findViewById(R.id.expanded_image);
        expandedImageView.setImageBitmap(loadedImagen);

        // Calculate the starting and ending bounds for the zoomed-in image. This step
        // involves lots of math. Yay, math.
        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffset = new Point();

        // The start bounds are the global visible rectangle of the thumbnail, and the
        // final bounds are the global visible rectangle of the container view. Also
        // set the container view's offset as the origin for the bounds, since that's
        // the origin for the positioning animation properties (X, Y).
        thumbView.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container).getGlobalVisibleRect(finalBounds, globalOffset);
        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x, -globalOffset.y);

        // Adjust the start bounds to be the same aspect ratio as the final bounds using the
        // "center crop" technique. This prevents undesirable stretching during the animation.
        // Also calculate the start scaling factor (the end scaling factor is always 1.0).
        float startScale;
        if ((float) finalBounds.width() / finalBounds.height()
                > (float) startBounds.width() / startBounds.height()) {
            // Extend start bounds horizontally
            startScale = (float) startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width()) / 2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        } else {
            // Extend start bounds vertically
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale * finalBounds.height();
            float deltaHeight = (startHeight - startBounds.height()) / 2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;
        }

        // Hide the thumbnail and show the zoomed-in view. When the animation begins,
        // it will position the zoomed-in view in the place of the thumbnail.
        thumbView.setAlpha(0f);
        expandedImageView.setVisibility(View.VISIBLE);

        // Set the pivot point for SCALE_X and SCALE_Y transformations to the top-left corner of
        // the zoomed-in view (the default is the center of the view).
        expandedImageView.setPivotX(0f);
        expandedImageView.setPivotY(0f);

        // Construct and run the parallel animation of the four translation and scale properties
        // (X, Y, SCALE_X, and SCALE_Y).
        AnimatorSet set = new AnimatorSet();
        set
                .play(ObjectAnimator.ofFloat(expandedImageView, View.X, startBounds.left,
                        finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.Y, startBounds.top,
                        finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X, startScale, 1f))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_Y, startScale, 1f));
        set.setDuration(mShortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
            }
        });
        set.start();
        mCurrentAnimator = set;

        // Upon clicking the zoomed-in image, it should zoom back down to the original bounds
        // and show the thumbnail instead of the expanded image.
        final float startScaleFinal = startScale;
        expandedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentAnimator != null) {
                    mCurrentAnimator.cancel();
                }

                // Animate the four positioning/sizing properties in parallel, back to their
                // original values.
                AnimatorSet set = new AnimatorSet();
                set
                        .play(ObjectAnimator.ofFloat(expandedImageView, View.X, startBounds.left))
                        .with(ObjectAnimator.ofFloat(expandedImageView, View.Y, startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView, View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView, View.SCALE_Y, startScaleFinal));
                set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }
                });
                set.start();
                mCurrentAnimator = set;
            }
        });
    }
}
