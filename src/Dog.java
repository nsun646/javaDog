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
    public void bark() {
        System.out.println("Dog Barked!");
    }
    public void jump() {
        System.out.println("Dog Jumped!");
    }

    public String getFurColor() {return furColor;
    }
    public String getEyeColor() {return eyeColor;
    }
    public String getName() {return name;
    }
    public int getWeight() {return weight;
    }
}
