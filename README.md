# Android_Progressbar
Using Progress Bar (Circular &amp; Horizantal) in the Android App

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

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

![Progress Bar App1](https://user-images.githubusercontent.com/74413402/192092798-a2f04311-c097-493e-b0e9-259c36a49c2a.png)
![Progress Bar App2](https://user-images.githubusercontent.com/74413402/192092799-b85c47cd-52fc-4836-8d15-e279ef569720.png)
![Progress Bar Code](https://user-images.githubusercontent.com/74413402/192092800-b4b45201-968d-4a7e-b212-c95aa27a3b94.png)
