package org.example.parameterizedTypeExamples;

public class IntegerPair {
    private Integer first;
    private Integer second;

    public IntegerPair() {
    }

    public IntegerPair(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "IntegerPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
