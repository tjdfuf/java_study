package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("푸딩", "치와와", 10);
        animals[1] = new Cat("검둥", "블랙러시안", "한국", "검정색");
        animals[2] = new Dog("흰둥", "불독", 20);
        animals[3] = new Cat("냥냥", "페르시안", "미국", "흰색");
        animals[4] = new Dog("구름", "비숑 프리제", 15);

        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
    }
}
