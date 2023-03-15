public class Truck extends Technic implements TypeWorkTrailler, TypeWorkEngine, TypeWorkTyre {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку Truck");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель Truck");
    }


    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп Truck");
    }
}
