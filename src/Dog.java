class Dog {
    private String furColor;
    private String eyeColor;
    private String name;
    private int weight;

    public Dog(String name, String eyeColor, String furColor, int weight) {
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.name = name;
        this.weight = weight;
    }

    public void run() {
        System.out.println("Dog Started Running!");
    }
    public void stop() {
        System.out.println("Dog Stopped Running!");
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFurColor() {
        return furColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
}
