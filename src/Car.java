public class Car extends Technic implements TypeWorkEngine, TypeWorkTyre {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку Car");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель Car");
    }

}
