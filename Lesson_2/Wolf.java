public class Wolf {
    private String gender = "M";
    private String nickName = "Рекс";
    private String color = "Серый";
    private float height = 1.80f;
    private float weight = 20f;
    private int age = 5;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "") {
            System.out.println("Пустая строка");
        } else {
            this.gender = gender;
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        if (nickName == "") {
            System.out.println("Пустая строка");
        } else {
            this.nickName = nickName;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "") {
            System.out.println("Пустая строка");
        } else {
            this.color = color;
        } 
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    void move() {
        System.out.print("Идет");
    }

    void run() {
        System.out.print("Бежит");
    }

    void hunt() {
        System.out.print("Охотится");
    }

    void howl() {
        System.out.print("Воет");
    }
}
