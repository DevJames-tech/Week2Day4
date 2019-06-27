package examples.aaronhoskins.com.homeworkexample.model.ZooAnimal;

import android.os.Parcel;
import android.os.Parcelable;

public class ZooAnimal implements Parcelable {
    private String mSpecies;
    private String mCategory;
    private String mLiveExpediency;
    private String mDiet;
    private String mImageUrl;
    private String mSound;

    public ZooAnimal() {
    }

    public ZooAnimal(String mSpecies, String mCategory, String mLiveExpediency, String mDiet, String mImageUrl, String mSound) {
        this.mSpecies = mSpecies;
        this.mCategory = mCategory;
        this.mLiveExpediency = mLiveExpediency;
        this.mDiet = mDiet;
        this.mImageUrl = mImageUrl;
        this.mSound = mSound;
    }

    protected ZooAnimal(Parcel in) {
        mSpecies = in.readString();
        mCategory = in.readString();
        mLiveExpediency = in.readString();
        mDiet = in.readString();
        mImageUrl = in.readString();
        mSound = in.readString();
    }

    public static final Creator<ZooAnimal> CREATOR = new Creator<ZooAnimal>() {
        @Override
        public ZooAnimal createFromParcel(Parcel in) {
            return new ZooAnimal(in);
        }

        @Override
        public ZooAnimal[] newArray(int size) {
            return new ZooAnimal[size];
        }
    };

    public String getmSpecies() {
        return mSpecies;
    }

    public void setmSpecies(String mSpecies) {
        this.mSpecies = mSpecies;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public String getmLiveExpediency() {
        return mLiveExpediency;
    }

    public void setmLiveExpediency(String mLiveExpediency) {
        this.mLiveExpediency = mLiveExpediency;
    }

    public String getmDiet() {
        return mDiet;
    }

    public void setmDiet(String mDiet) {
        this.mDiet = mDiet;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmSound() {
        return mSound;
    }

    public void setmSound(String mSound) {
        this.mSound = mSound;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mSpecies);
        parcel.writeString(mCategory);
        parcel.writeString(mLiveExpediency);
        parcel.writeString(mDiet);
        parcel.writeString(mImageUrl);
        parcel.writeString(mSound);
    }
}
