package com.mozhimen.scank.opencv.edge.interfaces;

import android.graphics.Bitmap;

import com.mozhimen.scank.opencv.edge.enums.ScanHint;

/**
 * Interface between activity and surface view
 */

public interface IScanner {
    void displayHint(ScanHint scanHint);
    void onPictureClicked(Bitmap bitmap);
}
