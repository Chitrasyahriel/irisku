package com.example.iriskuu;

import android.graphics.Bitmap;

import java.io.Serializable;

public class ClassifierResult implements Serializable {

    String maxResultId;
    float maxResultConfidence;

    public ClassifierResult() {
    }

    public String getMaxResultId() {
        return maxResultId;
    }

    public void setMaxResultId(String maxResultId) {
        this.maxResultId = maxResultId;
    }

    public float getMaxResultConfidence() {
        return maxResultConfidence;
    }

    public void setMaxResultConfidence(float maxResultConfidence) {
        this.maxResultConfidence = maxResultConfidence;
    }
}
