package Structural.Filter;

public class Part {

    /**
     * 重量
     */
    private int weight;

    /**
     * 长度
     */
    private int longs;

    /**
     * 宽度
     */
    private int width;

    /**
     * 高度
     */
    private int height;

    public Part(int weight, int longs, int width, int height) {
        this.weight = weight;
        this.longs = longs;
        this.width = width;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getLongs() {
        return longs;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
