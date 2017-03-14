package com.nordicsemi.nrfUARTv2;

/**
 * Created by wy on 2017/3/9.
 */

public class SpectrumData {
    private String name;
    private byte[] data;

    public SpectrumData(String name, byte[] data){
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
