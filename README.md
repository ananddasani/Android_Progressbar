# Android_Progressbar
Using Progress Bar (Circular &amp; Horizantal) in the Android App

# Code

#### 1st Activity 
```
ProgressBar progressBarHorizontal;
Button button;

progressBarHorizontal = findViewById(R.id.progressBarHorizantal);
button = findViewById(R.id.button);

          button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int val = 0;
                        while (val <= 100) {
                            val += 10;
                            sleep(1000);

                            //set the upgrade the progress bar
                            progressBarHorizontal.setProgress(val);
                        }
                    }
                });
                thread.start();
            }
        });
```

# App Highlight

<img src="app_images/Progress Bar Code.png" width="1000" /><br>

<img src="app_images/Progress Bar App1.png" width="300" /> <img src="app_images/Progress Bar App2.png" width="300" /><br>
