package com.uetechnologies.ukemeobong.learnibibio;

/**
 * Created by onboardingfacilitator on 05/02/2018.
 */

public class Word {

    private String mDefaultTranslation;


    private String mIbibioTranslation;

    private int mImageResourceId;

    public Word (String DefaultTranslation, String IbibioTranslation){

        mDefaultTranslation = DefaultTranslation;
        mIbibioTranslation = IbibioTranslation;
        mImageResourceId = getImageResourceId();

    }

    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }

    public String getIbibioTranslation() {
        return mIbibioTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
