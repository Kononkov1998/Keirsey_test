package com.example.wav9.caers;

import android.os.Parcel;
import android.os.Parcelable;

public class Counter implements Parcelable
{
    // счетсчик для каждой буквы
    private int countE;
    private int countI;
    private int countS;
    private int countN;
    private int countT;
    private int countF;
    private int countJ;
    private int countP;

    // конструктор
    public Counter()
    {
        this.countE = 0;
        this.countI = 0;
        this.countS = 0;
        this.countN = 0;
        this.countT = 0;
        this.countF = 0;
        this.countJ = 0;
        this.countP = 0;
    }

    protected Counter(Parcel in) {
        countE = in.readInt();
        countI = in.readInt();
        countS = in.readInt();
        countN = in.readInt();
        countT = in.readInt();
        countF = in.readInt();
        countJ = in.readInt();
        countP = in.readInt();
    }

    public static final Creator<Counter> CREATOR = new Creator<Counter>() {
        @Override
        public Counter createFromParcel(Parcel in) {
            return new Counter(in);
        }

        @Override
        public Counter[] newArray(int size) {
            return new Counter[size];
        }
    };

    // увеличить счетсчики
    public void increaseE()
    {
        this.countE++;
    }

    public void increaseI()
    {
        this.countI++;
    }

    public void increaseS()
    {
        this.countS++;
    }

    public void increaseN()
    {
        this.countN++;
    }

    public void increaseT()
    {
        this.countT++;
    }

    public void increaseF()
    {
        this.countF++;
    }

    public void increaseJ()
    {
        this.countJ++;
    }

    public void increaseP()
    {
        this.countP++;
    }

    // getter-ы счетсчиков
    public int getCountE()
    {
        return countE;
    }

    public int getCountI()
    {
        return countI;
    }

    public int getCountS()
    {
        return countS;
    }

    public int getCountN()
    {
        return countN;
    }

    public int getCountT()
    {
        return countT;
    }

    public int getCountF()
    {
        return countF;
    }

    public int getCountJ()
    {
        return countJ;
    }

    public int getCountP()
    {
        return countP;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(countE);
        dest.writeInt(countI);
        dest.writeInt(countS);
        dest.writeInt(countN);
        dest.writeInt(countT);
        dest.writeInt(countF);
        dest.writeInt(countJ);
        dest.writeInt(countP);
    }
}
