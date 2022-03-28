package Lesson5;

import Lesson5.somePrivateData.TestInterface;

public class EngineerEmployee extends Employee implements DebonusInterface, TestInterface {

    int fixedItems = 5;


    public EngineerEmployee(String name, int age, int salary){
        super(name, age, salary);
        this.setProfession("Engineer");
    }

    @Override
    public void getBonus() {
        System.out.println(bonusForFixes() + getSalary());
        this.doSmthExtra();
    }


    public int bonusForFixes() {
        return fixedItems * 100;
    }

    @Override
    public int getDebonus() {
        return 0;
    }

    @Override
    public int getDebonus(int extra) {
        return 0;
    }

    @Override
    public void doSmth() {

    }


}
