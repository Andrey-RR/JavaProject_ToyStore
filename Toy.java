public class Toy {
    private String id;
    private String name;
    private int frequency; // Частота выпадения

    public Toy(String id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    // Геттеры и сеттеры
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}