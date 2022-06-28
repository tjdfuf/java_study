package day19.lambda;

public class Apple {

    // 이 클래스 안에서만 쓸거면 여기에서 지정할 수 있음.
    enum Color{
        RED, GREEN
    }

    private int weight;  // 사과의 무게
    private Color color = Color.RED;  // 사과의 색상

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
